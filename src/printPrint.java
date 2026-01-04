public class printPrint {
    public static void main(String[] args) {
        String input= "brownfoxjump";
        char target ='o';
        printTarget(input, target);

    }

    public static void printTarget(String a, char b) {
        int count =0;
        for (int i=0; i<a.length(); i++) {
            if(a.charAt(i) == b){
                count ++;
            }
        }
        if (count !=0 ){
            System.out.println(count);
        } else {
            System.out.println("0");
        }
    }
}
