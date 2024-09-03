import java.util.*;
public class Longest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        input = input.replaceAll("[\\[\\]]", "");

        String[] arr = input.split("\\s*,\\s*");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i=0; i< arr.length; i++) {
            map.put(arr[i], arr[i].length());
        }

        String result = (String) map.keySet().toArray()[0];
        int max = map.get(map.keySet().toArray()[0]);
        for (int i=1; i < map.size(); i++) {
            if (max < map.get(map.keySet().toArray()[i])) {
                max = map.get(map.keySet().toArray()[i]);
                result = (String) map.keySet().toArray()[i];
            }
        }
        System.out.println(result);
    }
}
