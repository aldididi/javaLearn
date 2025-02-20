import java.util.Scanner;

public class jusArray {
    public static void main(String[] args) {
        String[] jus = {"alpukat", "apel", "jambu", "alpukat 2"};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] namaPengantre = s.split(",");

        for (int i = 0; i < namaPengantre.length; i++) {
            if (i < jus.length ) {
                System.out.println(namaPengantre[i] + " "+jus[i]);
            } else {
                System.out.println(namaPengantre[i] +"ga dapet") ;
            }


        }
    }
}
