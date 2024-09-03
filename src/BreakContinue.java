public class BreakContinue {
    public static void main(String[] args) {
        var counter =1;
        while (true){
            System.out.println(counter);
            counter++;

                if (counter > 42){
                    break;
                }
        }
        System.out.println("Error");
    }
}
