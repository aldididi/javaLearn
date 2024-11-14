import java.util.Scanner;

public class sumInputTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        //penjumlahan(input);
       // System.out.println(mod(input));
        System.out.println(penjumlahan2(input));
        //System.out.println(penjumlahan2(input)); -> ini kalo methodnya int bukan void
    }

    public static void penjumlahan(String varName) { //method void

        int length = varName.length();
        int sumDigit = 0;
        for (int i = 0; i< length; i++) {
            String digitStr = String.valueOf(varName.charAt(i));
            // System.out.println(digitStr);
            int digitInt = Integer.parseInt(digitStr);
            sumDigit += digitInt;
        }
        System.out.println(sumDigit);
    }
    public static int penjumlahan2(String varName) { //method int pke return
        int length = varName.length();
        int sumDigit = 0;
        for (int i = 0; i< length; i++) {
            String digitStr = String.valueOf(varName.charAt(i));
            // System.out.println(digitStr);
            int digitInt = Integer.parseInt(digitStr);
            sumDigit += digitInt;
        }
        //System.out.println(sumDigit);
        return sumDigit;
    }

    public static int mod(String inputan) {
        int sum =0;
        int inputanInt = Integer.parseInt(inputan);
        while (inputanInt > 0) {
            int lastDigit = inputanInt % 10;
            inputanInt = inputanInt/10;
            sum += lastDigit;
        }
        return sum;
    }

    }

