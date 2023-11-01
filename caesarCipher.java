import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    if(k>26) k = k%26;
    String store = "";
    for(int i=0;i<s.length();i++)
    {
        char ch =s.charAt(i);
        if(ch>='A' && ch<='Z')
        {
           int t = ch + k; //added k 
           if(t>'Z')
           {
               t=t-'Z';
               store =store +(char)('A' + t-1);
           }
           else{
               store =store +(char)(ch + k);
           }
        }
       else if(ch>='a' && ch<='z')
       {
           int t = ch + k; //added k 
           if(t>'z')
           {
               t=t-'z';
               store =store +(char)('a' + t-1);
           }
           else{
               store =store +(char)(ch + k);
           }
       }
       else{
           store=store+ch;
       }
      
    }
 return store;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
