
package threaddemo;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Driver
{
    public static void main(String[] args)
    {
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo2 t2 = new ThreadDemo2();
        t1.start();
        t2.start();
    }
}