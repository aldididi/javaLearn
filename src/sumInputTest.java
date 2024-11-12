import java.util.Scanner;

public class SumInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        penjumlahan(input);
       // penjumlahan2(input);
        //System.out.println(penjumlahan2(input)); -> ini kalo methodnya int bukan void
    }

    public static void penjumlahan(String varName) {


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
    public static int penjumlahan2(String varName) {


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

    }

