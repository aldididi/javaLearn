public class testabcd {


    static void finNonDuplicate(int a[]) {
        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    duplicate = true;
                }
            }
            if (!duplicate) {
                System.out.println(a[i] + "");
            }
        }
    }
    static void findDuplicate(int a[]) {
        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate) {
                continue;
            }
            int count = 0;
            for(int k=0; k<a.length; k++){
                if(a[i]==a[k]){
                   count++;
                }
            }
            System.out.print(a[i]+",");
        }
    }


    static void nonRepeat() {
        int[] numbers = {3, 3, 7, 5, 5};
        int nonRepeat = 0;
        for (int number : numbers) {
            nonRepeat ^= number;
        }
        System.out.println("Non repeat number is: " + nonRepeat);
    }

    static void removeDuplicate() {
        int[] numbers = {1, 2, 2, 3, 3, 3};
        for (int i = 0; i < numbers.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(numbers[i] + " ");
            }

        }
        System.out.println("-------");
    }
    static void testremove(){
        int[] arr = {1, 2, 2, 3, 3, 3};
        for (int i=0; i<arr.length; i++){
            boolean a = false;
            for (int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    a=true;
                    break;
                }
            }
            if(!a){
                System.out.print(arr[i]+" ");
            }
        }
    }

    static void countAppearance(){
        int arr[]= {1,1,2,2,2,3,4,4,5};
        for (int i=0; i< arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+" appears "+count+" times");
        }
    }

    static void revereseArray(){
        int arr[] = {20,30,40};
        int start  =0;
        int end = arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int num : arr){
            System.out.println(num);
        }
    }

    static void nonRepeatChar(){
        String str = "adudu";
        for(int i=0; i<str.length(); i++){
            boolean duplicate = false;
            for(int j=0; j<str.length(); j++){
                if(i!=j && str.charAt(i)==str.charAt(j)) {
                    duplicate = true;
                }
            }
            if(!duplicate){
                System.out.println(str.charAt(i));
            }
        }
    }
    static void nonRepeatChar2(String str){
        for(int i=0; i<str.length(); i++){
            boolean duplicate = false;
            for(int j=0; j<str.length(); j++){
                if(i!=j && str.charAt(i)==str.charAt(j)) {
                    duplicate = true;
                }
            }
            if(!duplicate){
                System.out.println(str.charAt(i));
            }
        }
    }

    static void checkCharFrequency(String str){
        for(int i=0; i < str.length(); i++){
            boolean duplicate = false;

            for (int k=0; k<i; k++){
                if(str.charAt(i) == str.charAt(k)){
                    duplicate = true;
                    break;
                }
            }
            if(duplicate){
                continue;
            }
            int count=0;
            for (int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i) +" =" + count+" times");
        }
    }

    static void checkCharFrequency2(String str){
        for (int i = 0; i < str.length(); i++) {

            // skip if this char already appeared before i
            boolean seenBefore = false;
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    seenBefore = true;
                    break;
                }
            }
            if (seenBefore) {
                continue;
            }

            // count frequency
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " = " + count + " times");
        }
    }

   static int findMax(int[] arr){
        int max= arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
   }

   static int findMin(int[] arr){
        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }

        }
       return min;
   }



   static void sumTwoArray(){
        int[] a={1,2,3};
        int[] b={1,2,3};
        int[] sum = new  int[a.length];

       for (int i=0; i<a.length; i++){
           sum[i]= a[i]+b[i];
           System.out.print( sum[i]);
       }
   }
}

