/*import java.io.*;
import java.net.*;
public class Server
{
    public static void main(String [] args) throws Exception
    {
        String clientSentence= "", capitalizedSentence;
        ServerSocket ls = new ServerSocket(1227);
        Socket connectionSocket = ls.accept();
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
        DataOutputStream toClient = new DataOutputStream (connectionSocket.getOutputStream());
        toClient.flush();
        while(!clientSentence.equals("USER_STOP"))
        {
            clientSentence = clientInput.readLine();
            capitalizedSentence = clientSentence;
            System.out.println(capitalizedSentence);
            toClient.flush();
        }
        
    }
}*/
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws Exception {
       
		ServerSocket ss = new ServerSocket(1227);
                Socket s = ss.accept();
		DataOutputStream output = new DataOutputStream(s.getOutputStream());
		BufferedReader input = new BufferedReader(new InputStreamReader(
				s.getInputStream()));
		//System.out.print("Enter username: ");
		Scanner i = new Scanner(System.in);
		//String username = i.nextLine() +'\n';
		System.out.println();
		String userInput = "_", fromOther = "_";
		System.out.print("Enter text: ");
		while (!userInput.equals("\\end")) 
                {
                    System.out.println("TT: ");
			fromOther = input.readLine();
			System.out.println(fromOther);
			userInput = i.nextLine() + '\n';
			output.writeBytes("TT: " +userInput);
			output.flush();
		}
		
		i.close();
                
		s.close();
		System.out.println("Goodbye!");
	}
}
