public class breakContinueLoop {
    public static void main(String[] args) {
        //break
        var counter =1;
        while (true){
            System.out.println("counter:"+counter);
            counter ++;

            if (counter > 100){
                break;
            }
        }
        System.out.println("loop stopped");

        System.out.println("=========");
        //continue ganjil

        for (var countContinue =1; countContinue <= 100; countContinue ++){
            if (countContinue % 1 ==0){
                continue;
            }
            System.out.println("ganjil:"+countContinue);
        }

    }


}
