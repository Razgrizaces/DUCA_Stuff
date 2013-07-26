
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Driver
{
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("144.118.98.139", 5556);
        DataOutputStream o = new DataOutputStream(s.getOutputStream());
        BufferedReader r = new BufferedReader(new InputStreamReader(s.getInputStream()));
        Scanner i = new Scanner(System.in);
        while(true){
            o.flush();
            String a = r.readLine();
            System.out.println("TT:" + i + "\r\n"); 
        }
}
}