public class methodReturnValue2 {
    public static void main(String[] args) {
        var result = sum(100, 200);
        System.out.println(result);

        //switch int hitungSemua
        System.out.println(hitungSemua(100, "+", 200));
        System.out.println(hitungSemua(100, "-", 200));
        System.out.println(hitungSemua(100, "asd", 200));
    }

    static int sum (int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitungSemua (int value1,String operation, int value2) {
        switch (operation) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
