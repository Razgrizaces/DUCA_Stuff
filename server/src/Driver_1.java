import java.io.*;
import java.net.*;
import java.util.Scanner;



public class Driver_1 extends Thread
{
    
    	public void run(){
    		while(true){
    		Socket s;
			try {
				s = new Socket("144.118.98.139",5556);
				DataOutputStream o = new DataOutputStream(s.getOutputStream());
				InputStreamReader ir = new InputStreamReader(s.getInputStream());
				BufferedReader r = new BufferedReader(ir);
				//so bufferedReaders just read them easier.. cool. 
				//hmm... use BufferedReader to display what other person writes
				o.writeBytes(r.readLine());
				o.writeBytes("ML:" + ir.toString());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.exit(1);
			}
			
    		
    	
    	}

    	}
}