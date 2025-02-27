import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class febMostSoldBook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] books = br.readLine().replace("[", "").replace("]", "").split(", ");
        System.out.println(solution(books));
    }


    private static String solution(String[] arr) {
        String result = "";
        int max = 1;
        int current = 1;
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    current++;
                }
            }
            if (current > max) {
                max = current;
                result = arr[i];
            }
        }
        return result;
    }
}