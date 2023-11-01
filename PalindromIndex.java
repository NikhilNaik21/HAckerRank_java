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
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
    // Write your code here
    int start = 0;
    int end = s.length() - 1;

    while(start < end) {
        if(s.charAt(start) != s.charAt(end)) {
            if(isPal(s, start+1, end)) {
                return start;
            } else {
                return end;
            }
        }
        start++;
        end--;
    }

    return -1;
}

static boolean isPal(String s, int start, int end) {
    while(start < end) {
        if(s.charAt(start) != s.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
