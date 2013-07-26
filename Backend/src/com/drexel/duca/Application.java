package com.drexel.duca;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.temboo.Library.Facebook.Reading.User;
import com.temboo.Library.Facebook.Reading.User.UserInputSet;
import com.temboo.Library.Facebook.Reading.User.UserResultSet;
import com.temboo.Library.Facebook.Searching.FQL;
import com.temboo.Library.Facebook.Searching.FQL.FQLInputSet;
import com.temboo.Library.Facebook.Searching.FQL.FQLResultSet;
import com.temboo.core.TembooException;
import com.temboo.outputs.Facebook.FacebookUser;

public class Application {

	private int idCounter = 1;
	private Facebook fb = new Facebook();
	private STUser user;
	public ArrayList<Long> friendFBids = new ArrayList<Long>();
	
	
	public void getSTUserFromFB() throws TembooException {
		fb.openTembooSession();
		fb.OAuth();
		
		User userChoreo = new User(fb.getSession());

		// Get an InputSet object for the choreo
		UserInputSet userInputs = userChoreo.newInputSet();

		// Set inputs
		userInputs.set_AccessToken(fb.getOAuthResults().get_AccessToken());

		// Execute Choreo
		UserResultSet userResults = userChoreo.execute(userInputs);

		FacebookUser fbUser = userResults.getUser();
		STUser user = new STUser(genSTid(), fbUser.getName(),
				new ArrayList<Integer>(),
				"MUST HAVE THEM PICK A USERNAME! FIX LATER!");
		user.setFbID(fbUser.getId());
		this.user = user;
	}

	public void getFriendsUsingST() throws TembooException, JSONException {

		FQL fQLChoreo = new FQL(fb.getSession());

		// Get an InputSet object for the choreo
		FQLInputSet fQLInputs = fQLChoreo.newInputSet();

		// Set inputs.... uid1's # is the user's facebook ID
		fQLInputs.set_Conditions("uid IN (SELECT uid2 FROM friend WHERE uid1="+user.getFbID()+") AND is_app_user=1");
		fQLInputs.set_AccessToken(fb.getOAuthResults().get_AccessToken());
		fQLInputs.set_Fields("uid,name");
		fQLInputs.set_Table("user");
		
		// Execute Choreo
		FQLResultSet fQLResults = fQLChoreo.execute(fQLInputs);
		String fQL_json = fQLResults.get_Response();
		JSONArray jsonResults = new JSONObject(fQL_json).getJSONArray("data");
		for(int i = 0; i < jsonResults.length(); i++) {
			JSONObject user = jsonResults.getJSONObject(i);
			friendFBids.add(user.getLong("uid"));
		}
		
	}

	public int genSTid() {
		return idCounter++;
	}
	
	public static void main(String[] args) throws TembooException, JSONException {
		Application app = new Application();
		app.getSTUserFromFB();
		app.getFriendsUsingST();
		System.out.println(app.friendFBids.toString());
		
	}
}
