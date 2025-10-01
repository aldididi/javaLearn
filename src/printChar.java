public class printChar {

    public static void main(String[] args) {
        String input = "bagogo";
        char target = 'm';
        printChar(input);
        System.out.println("-------");

        printChar2(input, target);

    }
    public static void printChar(String text){
        for (int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }

    public static void printChar2(String text, char text2){
        int count =0;
        for (int i = 0; i <= text.length()-1; i++){
            if (text.charAt(i) == text2){
                count++;
            }
        }
        if (count != 0){
            System.out.println("jumlah " + text2 + ":"+ count);
        } else {
            System.out.println("0");
        }
    }
}
