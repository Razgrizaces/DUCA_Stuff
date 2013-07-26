/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author DUCAStudent
 */
public class ThreadDemo extends Thread {

    
    public static void main(String[] args) 
    {
        
    }
    public void run()
    {
        while(true)
        {
            System.out.println("Hello!");
        }
    }
}
