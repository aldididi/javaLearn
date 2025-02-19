import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        words();
    }

    static void words(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int counting = s.split("\\s").length;
        System.out.println(counting);
    }
}
