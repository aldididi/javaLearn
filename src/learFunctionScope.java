public class learFunctionScope {
    public static void main(String[] args) {
           // random(12);
        int a =10;
        {
            a=100;
            System.out.println(a);
        }
        System.out.println(a);
    }

    static void random(int marks){
        int num =67;
        System.out.println(num);
        System.out.println(marks);
    }
}
