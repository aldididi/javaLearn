import java.util.Scanner;

public class reverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int number = sc.nextInt();
        int reversedNumber = reverse(number);
        System.out.println(reversedNumber);
    }
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastInt = number % 10;
            reversed = reversed * 10 + lastInt;
            number /= 10;
        }
        return reversed;
    }
}
