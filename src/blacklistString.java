import java.util.Scanner;

public class blacklistString {
    public static void main(String[] args) {
      // blacklist();
       //mcensorContains();
        censorLoopStar();
    }
    static void censorLoopStar(){
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine(); //"muksal anjir"
        // System.out.println(input);
        // String[] blacklist = {"anjir", "anjim"}
        String kosong = "";
        String blacklist = "anjir";
        String[] input_array = input.split(" "); // --> {"Saya", "anjing", "tiket", "anjir"}
        for (int i = 0; i < input_array.length; i++) {
            if (input_array[i].contains(blacklist)) {
                kosong = kosong + " [sensor]";
            } else {
                kosong = kosong + " " + input_array[i];
            }
        }
        System.out.println(kosong);
    }

    static void censorContains(){
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine(); //"muksal anjir"
        String blacklist = "muksalmina";
        int jumlahHurufdiBlaclist = blacklist.length();
        String replacer = "";
        for (int j=0;j<jumlahHurufdiBlaclist; j++) {
            replacer = replacer+"*";
        }

        String sensor = "";
        if (input.contains(blacklist)) {

            sensor = input.replace(blacklist, replacer);

        }
        System.out.println(sensor);
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
    }
}
