package hackathon;

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
import com.temboo.Library.NYTimes.MostPopular.GetMostViewed;
import com.temboo.Library.NYTimes.MostPopular.GetMostViewed.GetMostViewedInputSet;
import com.temboo.Library.NYTimes.MostPopular.GetMostViewed.GetMostViewedResultSet;
import com.temboo.core.TembooException;
import com.temboo.core.TembooSession;
import com.temboo.outputs.Facebook.FacebookUser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class Hackathon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TembooException, JSONException, IOException {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your username");
        String USER_NAME = a.nextLine();
        System.out.println("Please write your app name:");
        String APP_KEY_NAME = a.nextLine();
        System.out.println("Please write your app key:");
        String APP_KEY_VALUE = a.nextLine();
        System.out.println("Please print your api key:");
        String API_KEY = a.nextLine();
        System.out.println("Please print your time frame ie:) 1 = one day, 7 = a week, etc.");
        String time = a.nextLine();
        System.out.println("Please print your section ie)Music, World, or all-sections for everything:");
        String section = a.nextLine();
        for(int i = 0; i<7; i++)
            System.out.println("");
        
        TembooSession session = new TembooSession(USER_NAME, APP_KEY_NAME, APP_KEY_VALUE );
        GetMostViewed getMostViewedChoreo = new GetMostViewed(session);
        GetMostViewedInputSet getMostViewedInputs = getMostViewedChoreo.newInputSet();
        getMostViewedInputs.set_Section(section);
        getMostViewedInputs.set_APIKey(API_KEY);
        getMostViewedInputs.set_TimePeriod(time);
        GetMostViewedResultSet getMostViewedResults = getMostViewedChoreo.execute(getMostViewedInputs);
        JSONObject json = new JSONObject(getMostViewedResults.get_Response());
        JSONArray children = json.getJSONArray("results");
        for (int i = 0; i < children.length(); i++) {
            JSONObject child = children.getJSONObject(i);
            System.out.println(child.getString("title"));
        }
    }
}


