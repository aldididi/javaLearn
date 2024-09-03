import java.util.Scanner;
public class lengthAllWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        lengthOfLastWord(input);

       // System.out.println(lengthOfLastWord(input));
    }

    public static void  lengthOfLastWord(String s) {

        String[] arr = s.split(" ");
        int length = arr.length;
        //String lastWord = arr[length];
        int result = 0;

        for(int i = 0; i < length; i++)
       {
           //result = result+arr[i].length();
           //result = proses to sum the length of each words

           System.out.println(arr[i].length());
        }
       // System.out.println(result);
        //then print the result func

    }
}

