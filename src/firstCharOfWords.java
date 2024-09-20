import java.util.Scanner;

public class firstCharOfWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        firstCharOfWords1(input);
       // printEachChar(input);

    }

    public static void firstCharOfWords1(String s) {

        String[] arr = s.split(" ");
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            String muksal = arr[i];
            char hasil = muksal.charAt(0);

            System.out.println(hasil);
        }
    }

    public static void lastCharOnWords(String s) {

        String[] arr = s.split(" ");
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            String muksal = arr[i];
            char hasil = muksal.charAt(muksal.length() - 1);
            System.out.println(hasil);
        }
    }


    public static void printEachChar(String s) {
       for (int i = 0; i < s.length(); i++) {
           System.out.println(s.charAt(i));
       }
    }
}




