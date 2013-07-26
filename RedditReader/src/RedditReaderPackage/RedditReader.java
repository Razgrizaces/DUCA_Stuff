package RedditReaderPackage;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;
 
// http://www.java2s.com/Code/JarDownload/java/java-json.jar.zip
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
 
public class RedditReader {
    
    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
 
    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }
 
    public static void main(String[] args) throws IOException, JSONException {
        Scanner scan = new Scanner(System.in);
        System.out.println("If you want the front page, enter a blank line, if you want a subreddit, type r/");
        String sub = scan.nextLine();
        if(sub.equals("r/")||!sub.equals(""))
        {
            while(!sub.equals("r/"))
            {
                System.out.println("Wrong input, please either type a blank line or r/");
                sub = scan.nextLine();
            }
        }
        if(sub.equals(""))
        {
            String URL = "http://www.reddit.com/.json";
            JSONArray children = readJsonFromUrl(URL).getJSONObject("data").getJSONArray("children");
            for (int i = 0; i < children.length(); i++) {
                JSONObject child = children.getJSONObject(i);
                System.out.println(child.getJSONObject("data").getString("title"));
            }
            System.exit(0);
        }
        
        System.out.println("Enter the subreddit name:");
        String subreddit= scan.nextLine();
        System.out.println("Enter the filter ie)new, top, or blank if you don't want a filter");
        String filter = scan.nextLine();
        String URL = "http://www.reddit.com/" + sub + subreddit+ "/" + filter +  "/.json";
        JSONArray children = readJsonFromUrl(URL).getJSONObject("data").getJSONArray("children");
        for (int i = 0; i < children.length(); i++) {
            JSONObject child = children.getJSONObject(i);
            System.out.println(child.getJSONObject("data").getString("title"));
        }
    }
}