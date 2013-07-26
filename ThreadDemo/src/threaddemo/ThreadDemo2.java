package threaddemo;

public class ThreadDemo2 extends Thread
{
   public void run()
   {
       while(true)
       {
           System.out.println("Goodbye!");
       }
   }
}