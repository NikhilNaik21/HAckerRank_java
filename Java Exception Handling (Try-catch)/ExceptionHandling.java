
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
           
        try{
                int x =in.nextInt();
                int y =in.nextInt();
           int result = x/y;
            System.out.println(result);
        }
        catch( InputMismatchException e)
        {
           System.out.println("java.util.InputMismatchException");
        }
        
        catch( ArithmeticException e1)
        {
           System.out.println("java.lang.ArithmeticException: / by zero");
        }
        
        
       
    }
}
