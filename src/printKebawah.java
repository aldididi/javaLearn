public class printKebawah {

    public static void main(String[] args) {
        String input = "adudumama";
        printChar(input);
        char target ='m';
        System.out.println("----");
        printText(input, target);
      //  printTarget(input, target);
    }
    static void printChar(String text){
        for(int i=0; i<text.length(); i++ ){
            System.out.println(text.charAt(i));

        }
    }

    static void printText(String text, char text2) {
        int count = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            if (text.charAt(i) == text2) {
                count++;
            }
        }
        if(count != 0){
            System.out.println(count);
        }
        else {
            System.out.println("0");
        }

    }

    static void printTarget(String teks, char teks2){
        int count = 0;
        for (int i=0; i<teks.length(); i++ ){
            if (teks.charAt(i) == teks2){
                count++;
            }
        }
        if(count != 0){
            System.out.println(count);
        } else {
            System.out.println("tidak ada target");
        }
    }
}
