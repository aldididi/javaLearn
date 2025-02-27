import java.io.InputStreamReader;
import java.io.BufferedReader;

public class febCountingPairs {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //input [1,2,4,5....]
        String[] input = br.readLine().replace("[", "").replace("]", "").split(", ");
        String targetString = br.readLine();
        //input target

        int[] nums = new int[input.length];
        for(int i = 0; i < input.length; i++){
            nums[i] = Integer.parseInt(input[i].trim());
        }
        int target = Integer.parseInt(targetString);
        System.out.println(solution(nums, target));
    }

    /**
     * Update this function
     */
    private static int solution(int[] arr, int target) {
        int result = 0;

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1 ; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    result++;
                    // System.out.println(arr[i] + arr[j]);
                }
            }
        }

        return result;
    }
}