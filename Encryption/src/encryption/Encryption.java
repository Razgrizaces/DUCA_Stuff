package encryption;

import java.util.Scanner;

/**
 *
 * @author DUCAStudent
 */
public class Encryption {

    public static void main(String[] args) {
        /*get 2 prime numbers; a,b.
         C=a*b, m = totient(c) = (a-1)(b-1)
        e = any number coprime to M.
        d=modular inverse of e%m
            r^(totient(m)-1) % m
        public key is e, C.
        private key is d, C*/
        int a = getNthPrime((int)(Math.random()*100));
        int b = getNthPrime((int)(Math.random()*100));
        int c = a*b;
        int m = (a-1)*(b-1);
        int e = getCoprime(m);
        int d = modulo(e, (totient(m)-1), m);
        int x = 100;
        int y = modulo(x, e, c);
        int xx = modulo(y, d, c);
        System.out.println("My Public key is (e= " + e + ", c =" +c +")");
        System.out.println("My Private Key is (d= " + d + ", c =" +c + ")");
        System.out.println(x + " encrypted to " + y + " and decrypted back to " + xx);
        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter a secret word");
        String word = in.nextLine();
        for(int i = 0; i<word.length();i++)
        {
            int letter = word.charAt(i);
            int enc = modulo(letter, e, c);
            System.out.println(word.charAt(i) + " encrypts to " + enc);
        }
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter your d and c");
        int yourd = in2.nextInt();
        int yourc = in2.nextInt();
        int num = 0;
        do{
            System.out.println("enter a # to decrypt");
            num = in.nextInt();
            int dec = modulo(num, yourd, yourc);
            char ch = (char) dec;
            System.out.println("That decrypts to " +ch);
        }
            while(num!=2);*/
        Scanner abcd = new Scanner(System.in);
        String abcde = abcd.nextLine();
       int[] encrypt = Encryption.encrypt(abcde,  e, c);
       printArray(encrypt);
       String decrypt = Encryption.decrypt(encrypt, d, c);   
       System.out.println(decrypt);
    }
    public static int getNthPrime(int n)
    {
        int p = 2;
        int out = 0;
        while(out<n)
        {
            p++;
            if(isPrime(p))
            {
                out++;
            }
        }
        return p;
    }
    public static boolean isPrime(int n)
    {
        boolean output = true;
        for(int i = 2; i<n;i++)
        {
            if(n%i==0)
            {
                output = false;
            }
                
        }
        return output;
    }
    public static int GCD(int a, int b)
    {
        if(b==0)
            return a;
        return GCD(b, a%b);
    }
    public static int getCoprime(int n)
    {
        int coprime = -1;
        for(int i = 1; i<3*n; i++)
        {
            if(GCD(i, n)==1)
              coprime = i;  
        }
        return coprime;
    }
    //count all numbers coprime to n, from 1 to n-1
    public static int totient(int n)
    {
        int count = 0;
        for(int i = 1; i<n; i++)
        {
            if(GCD(n, i)==1)
                count ++;
        }
        return count;
    }
    public static int modulo(int a, int b, int c)
    {
        long x = 1;
        long y = a;
        while(b>0)
        {
            if(b%2==1)
                x=(x*y)%c;
            y = (y*y)%c;
            b /=2;
        }
        return (int)x %c;
    }
    //@param word is any string.
    //E is any number coprime to M
    //c is a*b.
    public static int[] encrypt(String word, int e, int c)
    {
        int[] encryption =  new int [word.length()];
        if(word == null || word.length()==0)
        {
           return encryption;
        }
        for(int i = 0; i<word.length();i++)
        {
            int let = word.charAt(i);
            int enc = modulo(let, e, c);
            encryption[i]=enc;
        }
        return encryption;
    }
    //@Param 
    //int[] encrypted - an array of encrypted letters, numbers, or symbols.
    //int d = private key
    //int c = private key
    public static String decrypt(int[] encrypted, int d, int c)
    {
        if(encrypted.length==0)
        {
            return "";
        }
        int num = 0;
        String word = "";
        for(int i = 0; i<encrypted.length;i++)
        {
            num = encrypted[i];
            int dec = modulo(num, d, c);
            char ch = (char) dec;
            word = word+ch;
        }
        return word;
            //System.out.println("That decrypts to " +ch);
        
    }
    public static void printArray(int[] array)
    {
        for(int i =0; i < array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
