import java.util.Scanner;

public class learnFunctionMethod {
    //take input 2 number and sum
    public static void main(String[] args) {
       // sum();
//        int sum2 = sum2();
//        System.out.println(sum2);

       //return string
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("entar name :");
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);

        //return int
     // int answer =  sum3(10,5);
      // System.out.println(answer);
    }

     static String myGreet(String name) {
        String message = "Hello " + name + "!";
        return message;

    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("input num 1:");
        num1 = in.nextInt();
        System.out.println("input num 2:");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println("sum :" + sum);
    }
    //retrun value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("input num 1:");
        num1 = in.nextInt();
        System.out.println("input num 2:");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum ;
    }
//return string value
    static String greet(){
        String greet = "Hello World!";
        return greet;
    }

    //pass value of int when called the method in main
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
