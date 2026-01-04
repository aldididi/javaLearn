import java.lang.reflect.Array;
import java.util.Scanner;

public class learnLoop {

    public static void main(String[] args) {
         //nested();
           // forLoop(10);
       // doWhileLoop(7);
      //  whileLoop();
      //  countdown(5);
       // factorial(5);
       //reverseInt(745);
        //sumDigit(2,5);
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        int[] arr={1,2,3,4};
//        reverseInt2(arr);
        //looploop();
        abcasd();
    }

    static void sumDigit(int n, int rem){
        int sum = 0;
        while(n >0){
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        } sum = sum + rem;
        System.out.println(sum);
    }

    static void reverseInt(int a){
        int reversed = 0;
        while(a != 0){
            int lastdigit = a%10;
            reversed = reversed * 10 + lastdigit;
            a = a/10;
        }
        System.out.println(reversed);
    }

    static void reverseInt2(int[] arr){
        for(int i=arr.length; i>0; i--){
            System.out.print(i);
        }
    }


    static void factorial(int n){
       int factorial = 1;
        for(int i=1; i<=n; i++){
           factorial = factorial * i;
        }
        System.out.println(n + factorial);
    }



    static void countdown(int n){
        for(int i=n; i>=1; i--){
            System.out.println(i);
        }
    }






    static void forLoop(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
    static void doWhileLoop(int n){
        int i=0;
        do{
            System.out.println(i);
            i++;
        } while (i<=n);

    }
    static void whileLoop(){
        int i=1;
        while (i<=20){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    static void nested(){
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }

    }
    static void looploop(){
       // String i ="aduduu";

        for (int i=1; i<=5; i++){
            for (int j = 1; j <= 2; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }

    static void abcasd(){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
      for (int i=0 ; i<3; i++){
          for(int j=0 ; j<3; j++){
              System.out.print(matrix[i][j]+ " ");
          }
          System.out.println();
      }



//        {
//            [1,2,3]
//            [4,5,6]
//            [7,8,9]
//        }
    }
}
