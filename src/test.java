import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();;

        int length = input.length();
        int start = 0;
        int end = length-1;
        boolean result = false;

/*
        while (start <= end) {
            if (input.charAt(start) == input.charAt(end)) {
                start++;
                end--;
                result = true;
            } else {
                result = false;
                start = length;
            }
        }
*/

        for (start = 0; start <= end; start++) {
            if (input.charAt(start) == input.charAt(end)) {
                end--;
                result = true;
            } else {
                result = false;
                start = length;
            }
        }

        System.out.println(result);
    }
}
