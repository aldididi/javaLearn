import java.util.Scanner;

public class learnFunctionP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number: ");
        int n = sc.nextInt();
        System.out.println(primus(n));

    }
    static boolean primus(int n){
        if (n % 2 == 0){
            return true;
        } else {
            return false;

        }
    }
}
