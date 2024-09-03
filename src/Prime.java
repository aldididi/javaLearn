import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int angka = input.nextInt();
        System.out.println(methodPrime(angka));
    }

    public static String methodPrime(int angka){
        String result = "";
        // boolean result = false;
        if (angka == 2){
            result = "Prime";
        } else if (angka < 2) {
            result = "Not Prime";
        } else {
            for (int i = 2; i <= angka-1; i++) {
                if (angka % i == 0) {
                    result = "Not Prime ";
                    break;
                } else {
                    result = "Prime";
                }
            }
        }
        return result;
    }


}


