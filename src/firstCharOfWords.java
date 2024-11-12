import java.util.Scanner;

public class firstCharOfWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        firstCharOfWords1(input);
        System.out.println("-------");
       printEachChar(input);
        System.out.println("-------");
        lastCharOnWords(input);
        System.out.println("-------");
        printWithoutSpecificChar(input);
        System.out.println("-------");
        reverseChar(input);

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

    public static void printWithoutSpecificChar(String s) {
        /*
        Condition: kalo ada 'a', jangan di-print
        Input: aku dan dia
        Output:
        k
        u

        d
        n

        d
        i
*/
        if (!s.contains("a")) {
            System.out.println("ini ga ada huruf a");
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != 'a') {
                    System.out.println(c);
                }
            }
        }
    }

    public static void reverseChar(String s) {
        for (int i =s.length()-1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
//        for (int i = s.length()-1 ; i < s.length(); i--) { --> this method do loop billions time
//            if (i>=0){
//
//            } else {
//                break;
//            }
//        }
    }
}




