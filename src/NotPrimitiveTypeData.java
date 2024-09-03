//tipe data ini bernilai null, penamaan kurang lebih sama seperti primitive. biasanya pakai huruf besar

public class NotPrimitiveTypeData {
    public static void main(String[] args) {
        Integer integer = 100;
        long iniLong;
        Long longLong = 10000l;
       // Long iniLong = 10000;
        System.out.println(integer);


        //convert primitve to non-primitive yg compatible
        int angka = 100000;
        Integer angka2= angka;
        System.out.println(angka);

        //convert primiti to non-primitive yg tidak compatible.
        int integer2 = 5000;
        Integer iniObject = integer2;

        short inishort = iniObject.shortValue();
        float iniFloat = iniObject.floatValue();
        System.out.println(iniFloat);

    }
}
