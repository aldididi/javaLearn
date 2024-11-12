import java.util.Scanner;

public class sumOfDigitz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        int sum = 0;
        for (int i=0; i<length; i++){
            String digitString = String.valueOf(input.charAt(i));
            int digitInt = Integer.parseInt(digitString);
            sum += digitInt;
        }
        System.out.println(sum);
    }
}
