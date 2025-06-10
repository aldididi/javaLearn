import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class nonRepeatChar {

    public static void main(String[] args) throws Exception {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        String inputText = inputReader.readLine();
        String result = solution(inputText);
        System.out.println(result);
    }


    public static String solution(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }


        Map<Character, Integer> characterFrequencies = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {

            char ch = inputString.charAt(i);
            characterFrequencies.put(ch, characterFrequencies.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < inputString.length(); i++) {

            char ch = inputString.charAt(i);
            if (characterFrequencies.get(ch) == 1) {
                return String.valueOf(ch);
            }
        }

        return "";
    }
}