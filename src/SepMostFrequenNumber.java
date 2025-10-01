import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class SepMostFrequenNumber {
    public static void main(String[] args) throws Exception {
        System.out.println("most frequent number ");
        System.out.println("input: 5 then 1 2 3 4 5 ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int output = solution(n, arr);
        System.out.println(output);
    }
    public static int solution(int n, int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;
        for (int num : map.keySet()) {
            int currentFreq = map.get(num);
            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                result = num;
            } else if (currentFreq == maxFreq) {
                result = Math.max(result, num);
            }
        }
        return result;
    }
}
