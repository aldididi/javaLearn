import java.util.Scanner;
import java.util.regex.Pattern;

public class blacklistString {
    public static void main(String[] args) {
       blacklist();
    }

    static void blacklist() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] blacklist = {"aNJIng", "BAbi", "anjay", "mau makan"};
        Boolean result= true;
       // s.equalsIgnoreCase()
        for(int i = 0; i < blacklist.length; i++){
           if(s.toLowerCase().contains(blacklist[i].toLowerCase())){
               result = true;
               break;
           } else {
               result = false;
           }
        }

        System.out.println(result);
    //equalsIgnoreCase
        //System.out.println(s.contains(blacklist[3]) ? "Yes" : "No");
    }
}
