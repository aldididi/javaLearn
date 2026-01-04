public class testOneOct {
    public static void main(String[] args) {
        int[] angka={1,2,3};
        int abc = findTheMAxValue(angka);
        System.out.println("max value "+ abc);
        System.out.println("-----");
        System.out.println("non repeat:");
        nonRepeat();
    }
    public static int findTheMAxValue(int[] arr){
       int max = arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
       }
        return max;
    }
   public static void nonRepeat(){
        int [] numbers = {1,1,4,4,3,3,5};
        int nonrepeat =0;
        for(int number : numbers){
            nonrepeat = nonrepeat ^ number;
        }
       System.out.println(nonrepeat);
   }

}
