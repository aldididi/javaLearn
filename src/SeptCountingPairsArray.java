import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class SeptCountingPairsArray {

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int output = solution(n, arr);
            System.out.println(output);
        }

        public static int solution(int n, int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : arr ){
                map.put(num, map.getOrDefault(num, 0)+1);
            }

            int pairsTotal =0;
            for (int count : map.values()){
                if(count >1 ){
                    pairsTotal += (long) count * (count  -1)/2;
                }
            }
            return pairsTotal;
        }

    }
}
