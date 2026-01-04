import java.util.Scanner;

public class reverseInt {
    public static void main(String[] args) {
//        input: 54321
//                output 12345

        //Scanner sc = new Scanner(System.in);
       // System.out.println("input number");
      //  int number = sc.nextInt();
      //  int reversedNumber = reverse(number);
       // System.out.println(reversedNumber);
       // System.out.println("======");
        int ab= reverse2();
        System.out.println(ab);
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
    public static int reverse2() {
        int num = 8763;
        int answer =0;
        while(num > 0){
            int rem = num % 10;
            num = num/ 10;
            answer = answer * 10 + rem;
        }
        return answer;
    }
}
