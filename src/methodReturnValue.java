// method yang mengembalikan value
//change void to type data yang mau dihasilkan, lalu pakai return do blok method untuk mengembalikan nilai


public class methodReturnValue {
    public static void main(String[] args) {
// 2. baru bikin deklarasi
        var result1 = sum(100, 200);
        System.out.println(result1);
        System.out.println(sum(200,300));

        //4. buat printout function hitung
        System.out.println(hitung(100, "+", 200));
        System.out.println(hitung(200, "-", 300));
        System.out.println(hitung(100, "salah", 200));

    }

//   1. bikin function dulu
    static int sum (int value1, int value2){
    var total = (value1 + value2);
    return total;
    }

    //3. return bisa digunakan beberapa kalo, contoh dalam percabangan
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
