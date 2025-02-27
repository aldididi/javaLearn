import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class febGreaterNumber {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       //input [1,2,4,5....]
       String[] input = br.readLine().replace("[","").replace("]","").split(", ");
       int[] nums = new int[input.length];
       for (int i = 0; i < input.length; i++) {
           nums[i] = Integer.parseInt(input[i].trim());
       }
       System.out.println(solution(nums));
   }

   private static int solution(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                break;
            } else {
                if (arr[i] < arr[i + 1]) {
                    result++;
                }
            }
        }
        return result;
   }

}
