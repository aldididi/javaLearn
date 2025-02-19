import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class hashMap {
    public static void main(String[] args) {
hash();
    }

    static void hash() {

        HashMap<String, String> userProfile1 = new HashMap<String, String>();
        userProfile1.put("nama", "adudu");
      userProfile1.put("dept", "IT");
       // System.out.println(userProfile1);

        HashMap<String, String> userProfile2 = new HashMap<String, String>();
        userProfile2.put("nama", "Muksal");
        userProfile2.put("dept", "MM");
      //  System.out.println(userProfile2);
        //System.out.println("=======");

        String temp = userProfile1.get("nama");
        userProfile1.put("nama", userProfile2.get("nama"));
        userProfile2.put("nama", temp);

        System.out.println(userProfile1);
        System.out.println(userProfile2);
       // String replace = userProfile.replace();
    }


}
