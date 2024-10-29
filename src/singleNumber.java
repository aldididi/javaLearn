import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class singleNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();
        System.out.println(singleNumber(string));
    }

    public static  String singleNumber(String numsString) {
        String[] nums = numsString.split(",");
        List<String> list = new ArrayList<>();
        String ans = "All numbers are at least 2";
        for (int j = 0; j < nums.length; j++) {
            list.add(nums[j]);
        }
        for (int i = 0; i < list.size() ; i++) {

            int indexPertama = list.indexOf(nums[i]);
            int indexKedua = list.lastIndexOf(nums[i]);

            if (indexPertama == indexKedua) {
                ans = list.get(i);
                break;
            }
        }
        return ans;
    }
}
