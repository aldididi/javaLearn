import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input text :");
        String input = s.nextLine();

        int length = input.length();
        int start = 0;
        int end = length-1;
        boolean result = false;

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
