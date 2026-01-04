import java.util.Arrays;

public class learnFunctionMethodArgumentV {
    public static void main(String[] args) {
        functionMethodArgumentV(4,3,2,23,4,3);
    }

    static void functionMethodArgumentV(int ... v) {
        System.out.println(Arrays.toString(v));
        System.out.println(v);
    }
}
