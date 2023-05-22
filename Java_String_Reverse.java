import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         int n=A.length();
         char B []= A.toCharArray();
         String c ="";
        //  A=A+"\0";
        
        for(int i=B.length-1;i>=0;i--)
        {
             c= c + B[i];
        }
        if(A.equalsIgnoreCase(c)){
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
        }
        
        }
    }



