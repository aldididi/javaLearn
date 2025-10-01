import java.util.HashMap;
import java.util.Scanner;

public class SeptSecondMostFreq {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String input = s.nextLine();
//
//        String[] arr = input.split(",");
//
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (String str : arr) {
//            map.put(str, map.getOrDefault(str, 0) + 1);
//        }
//
//        int max = map.get(map.keySet().toArray()[0]);
//        for (int i=1; i < map.size(); i++) {
//            if (max < map.get(map.keySet().toArray()[i])) {
//                max = map.get(map.keySet().toArray()[i]);
//            }
//        }
//        System.out.println(map.keySet().toArray()[1]);
//    }

    public static void main(String[] args) {

//        input : 1 2 2 3 3
//            output : 2

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        HashMap <String, Integer> map = new HashMap<>();
        String [] arr = input.split(" ");
        for (String str: arr){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int max = map.get(map.keySet().toArray()[0]);
        for( int i=1; i<map.size(); i++){
            if(max < map.get(map.keySet().toArray()[i])){
                max = map.get(map.keySet().toArray()[i]);
            }
        }
        System.out.println(map.keySet().toArray()[1]);
    }
}
