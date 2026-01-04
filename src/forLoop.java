public class
forLoop {
    public static void main(String[] args) {

        //loop with init statement
//        for ( var count=1; count<=10;) {
//            System.out.println("count" + count);
//            count++;
//        }
        int[] numbers = {3, 4, 5, 6, 7};
        int target = 10;
        doubleLoop(numbers, target);
        System.out.println("=====");
        //loop with post statement
//        for ( var count=1; count<5;  count++) {
//            System.out.println("iteration " + count);
//
//        }
//
//        for ( int i=0; i<5; i+=2) {
//            System.out.println(i);
//        }

    }

    static void doubleLoop(int arr[], int target){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("Pairs: " + arr[i] + ", " + arr[j] );
                }
                }
            }
        }
    }

