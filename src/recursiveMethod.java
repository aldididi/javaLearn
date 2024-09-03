
//method yang memanggil method itu sendiri, biasanya untuk case factorial

public class recursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
    }

    //factorial biasa menggunakan looping for
    static int factorialLoop(int value){
        var result =1;
        for (var counter =1; counter <= value; counter ++){
            result *= counter;
        }
        return result;
    }

    //factorial menggunakan recursive
    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value -1);
        }
    }
}
