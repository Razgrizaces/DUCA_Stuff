

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
/*DataOutputStream output = new DataOutputStream(s.getOutputStream());
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
                    System.out.println("ML: ");
			fromOther = input.readLine();
			System.out.println(fromOther);
			userInput = i.nextLine() + '\n';
			output.writeBytes("ML: " +userInput);
			output.flush();
		}
		
		i.close();
                
		s.close();
		System.out.println("Goodbye!");*/

        /*Socket s = new Socket("www.drexel.edu", 80);
        DataOutputStream o = new DataOutputStream(s.getOutputStream());
        BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
        o.writeBytes(" get index .html http/1.1\r\n");
        o.writeBytes(" Host: www.drexel.edu\r\n");
        o.writeBytes(" \r\n");
        o.flush();
        String a = r.readLine();
        System.out.println(a); 
        */
/*
        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        BufferedReader input = new BufferedReader(new InputStreamReader(
                s.getInputStream()));
        //System.out.print("Enter username: ");
        Scanner i = new Scanner(System.in);
        //String username = i.nextLine() + '\n';
        System.out.println();
        String userInput = "_", fromOther = "_";
        System.out.print("Enter text: ");
        while (!userInput.equals("USER_STOP")) {
            System.out.print("RS: ");
            userInput = i.nextLine() + '\n';
            output.writeBytes("RS: " + userInput);
            output.flush();
            fromOther = input.readLine();
            System.out.println(fromOther);
        }

        i.close();
        s.close();
        System.out.println("Goodbye!");*/