import java.lang.reflect.Array;
import java.util.Arrays;

public class learnFunctionSwap {
    public static void main(String[] args) {
        int[] arr={1, 3,2,45,6 };
        change(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }

    static void change(int[] number){
        number[1]=99;
    }
}
