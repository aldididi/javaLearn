public class java1 {
    public static void main(String[] args) {
    //abc(1);
        whileProg(4);
    }
    public static void abc(int totalCheck){
        if (totalCheck > 3 ){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void whileProg(int increment){
        while (increment < 3){
            System.out.println("naik");
            increment ++;
        }
    }
}
