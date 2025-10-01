public class angka2 {
    public static void main(String[] args) {
        int num =21;
       // printAngka(num);
       // System.out.println("=====");

      //  int num2 =22;
        //printGenap(num2);

        // System.out.println("=====");
      int[] listarray = {2,3,6,7,89,1,221,23};
      greatestArr(listarray);


    }
    //print angka ganjil
    public static void printAngka(int angka){
        for(int i=1;i<=angka;i++){
            if((i%2) != 0){
                System.out.print(i);
                if((i+1)%2==angka){
                    System.out.print(" --");
                } else {
                    System.out.print(",");
                }
            }
        }
        }

        //print genap doang
        public static void printGenap(int genap){
        for (int i=1;i<=genap;i++){
            if((i%2) == 0){
                if (i == genap ){
                    System.out.print(i);
                }else {
                    System.out.print(i+",");
                }

            }
        }
        }

        public static void greatestArr(int[] arr){
        int arr1 = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i] > arr1){
                arr1 = arr[i];
            }
        }
            System.out.println( "greates array is: "+arr1);
        }
    }

