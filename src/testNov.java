public class testNov {
    public static void main(String[] args) {
        int[] a ={1,4,5,6,0};
        int[] nums = {3, -1, 4, 0, -5, 2};
       // System.out.println( sum(nums));
        System.out.println(countGreater(a, 2));
        countGreater(a,2);

//        countGreater(a,2);
    }
//if the value is negative dont add the negative
    static int sum(int[] a){
        int sum = 0;
        int temp;
        for (int i=0; i < a.length; i++){
            if(a[i] > 0){
                sum = sum+a[i];
            }
            //System.out.println(a[i]);
        }
        return sum;

    }
    static int countGreater(int[] a, int n){
        for(int i=0; i <a.length; i++){
            int temp;
            if (a[i] > n){
                System.out.print(a[i]);
            }
        }
       return 0;
    }



    //3
}

