public class countOccurences {
    public static void main(String[] args) {
//        int n =43445;
//
//        int count=0;
//        while (n>0){
//            int rem = n%10;
//            if(rem == 4){
//                count ++;
//            }
//            n=n/10;
//        }

        int a=1233333333;

        int count = 0;
        while (a > 0){
            int reminder = a % 10;
            if(reminder == 3){
                count++;
            }
            a = a / 10;
        }
        System.out.println(count);

    }
}
