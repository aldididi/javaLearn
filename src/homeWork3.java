import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class homeWork3 {
    public static void main(String[] args) {
        fares();
    }
    public static void fares(){
        Map<String, Integer> map = new HashMap<>();
        map.put("GA", 3000000);
        map.put("SQ", 2000000);
        map.put("QQ", 2300000);
        map.put("QZ", 3000000);

        //print hashmap
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("aircode " + key + " : " + value);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("== fare == ");
        System.out.println("avail " + map.keySet());
        System.out.println("input airline code : ");
        String input = sc.nextLine().toUpperCase();
        if(map.containsKey(input)){
            Integer fare = map.get(input);
            System.out.println("fares " + input + "= Rp." + fare);
        } else {
            System.out.println("not found");
        }

    }
}
