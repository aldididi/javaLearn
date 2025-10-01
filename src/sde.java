import java.util.Scanner;

public class sde {
    //main input, target, logc
    public static void main(String[] args) {
        String input = "AUTOMATION";
        char target='O';
       logic(input, target);

    }

    private static void logic(String input, char text2){
        int count = 0;
        for (int i = 0; i <= input.length()-1; i++){
            if (input.charAt(i) == text2){
                count++;
            }
        }

        if(count !=0 ){
            System.out.println("jumlah "+text2+"+ "+count);
        } else {
            System.out.println("0");
        }
    }
}
