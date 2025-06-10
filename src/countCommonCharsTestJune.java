import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;
public class countCommonCharsTestJune {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();
        int output = solution(input1, input2);
        System.out.println(output);
    }

    public static int solution(String input1, String input2){
        if (input1 == null || input2==null || input1.isEmpty() || input2.isEmpty()){
            return 0;
        }
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c: input1.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }
        int commonChars =0;
        for (char c: input2.toCharArray()){
            if (charCount.containsKey(c) && charCount.get(c) > 0){
                commonChars++;
                charCount.put(c, charCount.get(c)-1);
            }
        }
        return commonChars;
    }
}

