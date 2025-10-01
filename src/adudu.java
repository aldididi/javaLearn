import java.util.HashSet;
import java.util.Set;

public class adudu {
    public static void main(String[] args) {
  //  Abc();
    //Abc2();
    Abc3();
   // Abc4("fadhlan","male");
        System.out.println("---");
        Abc5();

    }
       public static void Abc (){
           System.out.println("nama saya");
           System.out.println("gender saya");
 }

 public static void Abc2(){
     int[] array1={1,2,3,4,5};
     int[] array2={2,3,4,5,7};
     Set<Integer> set=new HashSet<>();
     for(int number:array1){
         set.add(number);
     }

     Set<Integer> set2=new HashSet<>();
     for(int number:array2){
         if(set.contains(number)){
             set2.add(number);
         }
     }

     System.out.println(set2);
 }

 public static void Abc3(){
     int[] array1 = {1, 2, 3, 4, 5, 10,7,3};
     int[] array2 = {4, 5, 6, 7, 8, 10,8,8};

     Set<Integer> set=new HashSet<>();
     for(int number1:array1){
         for(int number2:array2){
             if(number1==number2){
                 set.add(number1);
                 break;
             }
         }
     }

     System.out.println(set);
 }

 public static void Abc4(String name, String anu){
        if(anu.equals("male")){
            System.out.println("Mr. "+ name);
        } else if(anu.equals("female")){
            System.out.println("Mrs. "+name);
        } else {
            System.out.println("not found");
        }
 }

 public static void adudududu(String nama, String malu){
        if(malu.equals("male")){
            System.out.println("Mr. "+ nama);
        } else if(malu.equals("female")){
            System.out.println("Mrs. "+nama);
        }
 }

 public static void Abc5(){
     int[] array1 = {1, 2, 3, 4, 5, 10,7,3};
     int[] array2 = {4, 5, 6, 7, 8, 10,8,8};

     for(int i=0; i<array1.length; i++ ){
         for(int j=0; j<array2.length; j++){
             if(array1[i] == array2[j]){
                 System.out.println(array2[j]);
             }
         }
     }
 }









}
