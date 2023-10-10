import java.io.*;
import java.util.*;


class Prime
{
    public void checkPrime(int... arr )
    {
        int a []= arr;
        for(int i =0 ; i<arr.length;i++ )
        {
            if(arr[i]<2)
            {
                continue;
            }
            boolean flag = true;
            for(int j =2;j<a[i];j++)
            {
                if(a[i]%j==0)
                {
                    flag =false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}


public class Solution {

    public static void main(String[] args) {
        
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int n4=Integer.parseInt(br.readLine());
        int n5=Integer.parseInt(br.readLine());
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);    
        
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}
