public class ifElse {
    public static void main(String[] args) {
        var score = 99;
        var abs = 90;

//        if (score >=75 && abs>=76) {
//            System.out.println("lulus");
//        }

        var lulusScore = score >= 78;
        var lulusAbs = abs >= 87;
        var lulusSemua = lulusAbs && lulusScore;

        if (lulusSemua){
            System.out.println("selamat!");
        } else {
            System.out.println("ga selamat");
        }

        if (score >= 90 && abs >=90 ) {
            System.out.println("A");
        } else if (score >= 80 && abs >=80 ) {
            System.out.println("A");
    }
}}
