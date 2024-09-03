import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPalindrome {
    public static void main(String[] args) {
        palindromeTest("ads");
    }

    public static boolean palindromeTest(String value){
        for (int i = 0; i < value.length(); i++){
            int indexFirst = i;
            int indexLast =value.length()-i-1;
            //System.out.println( i + ":" + ());

            if(value.charAt(indexFirst) != value.charAt(indexLast)){
                return false;
            }
        }

        return true;
//        String temp = "";
//
//        for (int i = value.length() - 1; i >= 0; i--) {
//           temp = temp + value.charAt(i);
//        }
//        System.out.println(temp);
//        return temp.equals(value);


    }
}
