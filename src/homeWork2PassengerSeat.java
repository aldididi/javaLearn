public class homeWork2PassengerSeat {
    public static void main(String[] args) {
        String[] passengers ={
                "Aldy", "Bayu", "Cici", "Dani", "Erika", "Fiona", "Galih", "Haniah",
                "Ian", "Juli", "Kelvin", "Lambok", "Mike", "Norma", "Osmond", "Prabhleen",
                "Queen", "Rahman", "Sanah", "Trisina"
        };
        char[] seat = { 'A', 'B', 'C', 'D', 'E', 'F'};
        int passengerIndex = 0;
        System.out.println("passengers seat");
        for (int row=1; row <= 3; row++){
            for (char seats : seat){
                if (passengerIndex < passengers.length){
                    String currentPassenger = passengers[passengerIndex];
                    System.out.println(currentPassenger + " -> " + row + seats);
                    passengerIndex++;
                }else{
                    break;
                }

            }
        }
    }
}
