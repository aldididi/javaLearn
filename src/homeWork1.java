import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        homeWork();
    }
    public static void homeWork() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ticket price:");
        double ticketPrice = input.nextDouble();

        System.out.println("enter days before depart:");
        int daysBeforeDepart = input.nextInt();


        if (daysBeforeDepart >= 7){
            System.out.println("refund : " + ticketPrice);
        } else if (daysBeforeDepart >= 3 && daysBeforeDepart <= 7 ) {
            System.out.println("refund 50% : " + ticketPrice * 0.5);
        } else {
            System.out.println("NO REFUND!");
        }
    }
}
