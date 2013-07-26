/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package temboofacebooklister;

import com.temboo.Library.Facebook.OAuth.FinalizeOAuth;
import com.temboo.Library.Facebook.OAuth.FinalizeOAuth.FinalizeOAuthInputSet;
import com.temboo.Library.Facebook.OAuth.FinalizeOAuth.FinalizeOAuthResultSet;
import com.temboo.Library.Facebook.OAuth.InitializeOAuth;
import com.temboo.Library.Facebook.OAuth.InitializeOAuth.InitializeOAuthInputSet;
import com.temboo.Library.Facebook.OAuth.InitializeOAuth.InitializeOAuthResultSet;
import com.temboo.core.TembooException;
import com.temboo.core.TembooSession;
import java.util.Scanner;


public class TembooFacebookLister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TembooException {
        // Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
        TembooSession session = new TembooSession("Razgriz", "MyFirstApp", "d0e35359-4346-4d1b-a");
        InitializeOAuth initializeOAuthChoreo = new InitializeOAuth(session);

        // Get an InputSet object for the choreo
        InitializeOAuthInputSet initializeOAuthInputs = initializeOAuthChoreo.newInputSet();

        // Set inputs
        initializeOAuthInputs.set_AppKeyName("MyFirstApp");
        initializeOAuthInputs.set_AccountName("Razgriz");
        initializeOAuthInputs.set_AppID("195605060602068");
        initializeOAuthInputs.set_AppKeyValue("d0e35359-4346-4d1b-a");

        // Execute Choreo
        InitializeOAuthResultSet initializeOAuthResults = initializeOAuthChoreo.execute(initializeOAuthInputs);
        System.out.println(initializeOAuthResults.get_CallbackID());
        System.out.println(initializeOAuthResults.get_AuthorizationURL());
        Scanner in = new Scanner(System.in);
        in.nextLine();
        
        FinalizeOAuth finalizeOAuthChoreo = new FinalizeOAuth(session);

        // Get an InputSet object for the choreo
        FinalizeOAuthInputSet finalizeOAuthInputs = finalizeOAuthChoreo.newInputSet();

        // Set inputs
        finalizeOAuthInputs.set_AccountName("razgriz");
        finalizeOAuthInputs.set_AppKeyName("MyFirstApp");
        finalizeOAuthInputs.set_AppID("195605060602068");
        finalizeOAuthInputs.set_AppKeyValue("d0e35359-4346-4d1b-a");
        finalizeOAuthInputs.set_AppSecret("c048d3045be44177e899eacaae6198de");
        finalizeOAuthInputs.set_CallbackID(initializeOAuthResults.get_CallbackID());
        // Execute Choreo
        FinalizeOAuthResultSet finalizeOAuthResults = finalizeOAuthChoreo.execute(finalizeOAuthInputs);
    }
}
