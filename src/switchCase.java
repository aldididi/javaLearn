public class switchCase {
    public static void main(String[] args) {
        var nilai = "C";
        switch (nilai) {
                case "A":
                System.out.println("nilai A");
                break;
                case "B":
                case "C":
                System.out.println("nilai B atau C");
                break;
            case "D":
                System.out.println("dapat D");
            default:
                System.out.println("nilai Default");
        }
            /// SWITCH LAMBDA
        switch (nilai){
            case "A" -> System.out.println("nilai A lambda ");
            case "B", "C" -> System.out.println("nilai B C lambda ");
            default -> {
                System.out.println("nilai default lambda ");
            }
        }

        //switch yield
        var nilai2 = "A";
       String selamat;
        selamat = switch (nilai2){
            case "A":
                yield "wow dapat A";
            case "B","C":
                yield  "wow dapat B C";
            case "D":
                yield "wow dapat D";
            default:
                yield "yahhh";
        };
        System.out.println(selamat);
    }


}
