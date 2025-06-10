import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class febMostSoldBook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] books = br.readLine().replace("[", "").replace("]", "").split(", ");
        System.out.println(solution(books));
    }


    private static String solution(String[] arrBooks) {
        String result = "";
        int max = 0;
        int current = 1;
        for (int i=0; i<arrBooks.length; i++) {
            for (int j=i+1; j<arrBooks.length; j++) {
                if (arrBooks[i].equals(arrBooks[j])) {
                    current++;
                }
            }
            if (current > max) {
                max = current;
                result = arrBooks[i];
            }
        }
        return result;
    }
}