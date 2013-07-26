import java.io.IOException;
import java.net.*;


public class Server1 {

	public static void main(String []args){
		Driver t1 = new Driver();
		Client t2 = new Client();
		try {
			ServerSocket ss = new ServerSocket(5556);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	//	t1.start();
//		t2.start();
	}
	
}
