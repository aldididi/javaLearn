import java.util.Scanner;
public class lengthLastWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        //hello world

//        String[] arr = input.split(" ");
//        //hello & world
//
//        int length = arr.length;
//        String lastWord = arr[length - 1];
        System.out.println(lengthOfLastWord(input));

        }

    public static int lengthOfLastWord(String s) {
        //Scanner s = new Scanner(System.in);
        //String input = s.nextLine();

        String[] arr = s.split(" ");
        int length = arr.length;
        String lastWord = arr[length-1];
        //System.out.println(lastWord);

        return lastWord.length();

    }
    }

