import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class SeptLongestRunofIdenticalChars {
    public static void main(String[] args) throws Exception {
        System.out.println("input: aabbccc");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = solution(input);
        System.out.println(output);
    }

    public static String solution(String input) {
       if (input == null || input.isEmpty() ) {
            return "0";
       }

       char longestChars = input.charAt(0);
       int maxLength = 1;

       char currentChar = input.charAt(0);
       int currentLength = 1;

       for (int i=1; i<input.length(); i++) {
           if (input.charAt(i) == currentChar) {
               currentLength++;
           } else  {
               if (currentLength > maxLength) {
                   maxLength = currentLength;
                   longestChars = currentChar;
               }
               currentChar = input.charAt(i);
               currentLength = 1;
           }
       }
        if (currentLength > maxLength) {
            maxLength = currentLength;
            longestChars = currentChar;
        }

        return longestChars + " "+ maxLength;
    }
}
