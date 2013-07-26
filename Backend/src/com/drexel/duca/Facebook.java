package com.drexel.duca;

import java.util.Scanner;

import com.google.gson.Gson;
import com.temboo.Library.Facebook.OAuth.FinalizeOAuth;
import com.temboo.Library.Facebook.OAuth.FinalizeOAuth.FinalizeOAuthInputSet;
import com.temboo.Library.Facebook.OAuth.FinalizeOAuth.FinalizeOAuthResultSet;
import com.temboo.Library.Facebook.OAuth.InitializeOAuth;
import com.temboo.Library.Facebook.OAuth.InitializeOAuth.InitializeOAuthInputSet;
import com.temboo.Library.Facebook.OAuth.InitializeOAuth.InitializeOAuthResultSet;
import com.temboo.Library.Facebook.Reading.User;
import com.temboo.Library.Facebook.Reading.User.UserInputSet;
import com.temboo.Library.Facebook.Reading.User.UserResultSet;
import com.temboo.Library.Facebook.Searching.FQL;
import com.temboo.Library.Facebook.Searching.FQL.FQLInputSet;
import com.temboo.Library.Facebook.Searching.FQL.FQLResultSet;
import com.temboo.core.TembooException;
import com.temboo.core.TembooSession;
import com.temboo.outputs.Facebook.FacebookUser;

public class Facebook {
	
	private TembooSession session;
	private FinalizeOAuthResultSet OAuthResults;
	public Facebook()
        {
            
        }
	public void openTembooSession() throws TembooException {
		session = new TembooSession("ryseff724", "SafeTalk", "d9049685-fa16-4275-b");
		
	}
	
	public String OAuth() throws TembooException {
		InitializeOAuth initializeOAuthChoreo = new InitializeOAuth(session);

		// Get an InputSet object for the choreo
		InitializeOAuthInputSet initializeOAuthInputs = initializeOAuthChoreo.newInputSet();

		// Set inputs
		initializeOAuthInputs.set_AppID("196659050499139");

		// Execute Choreo
		InitializeOAuthResultSet initializeOAuthResults = initializeOAuthChoreo.execute(initializeOAuthInputs);
		
		System.out.println(initializeOAuthResults.get_AuthorizationURL());
		Scanner in = new Scanner(System.in);
		in.nextLine();
		
		// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
		// TembooSession session = new TembooSession("ryseff724", "APP_KEY_NAME", "APP_KEY_VALUE");
		FinalizeOAuth finalizeOAuthChoreo = new FinalizeOAuth(session);

		// Get an InputSet object for the choreo
		FinalizeOAuthInputSet finalizeOAuthInputs = finalizeOAuthChoreo.newInputSet();

		// Set inputs
		finalizeOAuthInputs.set_CallbackID(initializeOAuthResults.get_CallbackID());
		finalizeOAuthInputs.set_AppSecret("96c5d4b9d54eff85e1e04168171859b0");
		finalizeOAuthInputs.set_AppID("196659050499139");

		// Execute Choreo
		OAuthResults = finalizeOAuthChoreo.execute(finalizeOAuthInputs);
		
		return OAuthResults.get_AccessToken();
	}
	

	public TembooSession getSession() {
		return session;
	}

	public void setSession(TembooSession session) {
		this.session = session;
	}

	public FinalizeOAuthResultSet getOAuthResults() {
		return OAuthResults;
	}

	public void setOAuthResults(FinalizeOAuthResultSet oAuthResults) {
		OAuthResults = oAuthResults;
	}
}
