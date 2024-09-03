public class arrayTypeData {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[4];
        arrayString[0] = "henlo1";
        arrayString[1] = "henlo2";
        arrayString[2] = "henlo3";
        arrayString[3] = "henlo4";

        System.out.println(arrayString[3]);

        arrayString[0] = "ubah data";
        System.out.println(arrayString[0]);

        //array inisialisasi
        String[] arrayNama = {
                "nama1", "nama2", "nama3"
        };
        arrayNama[1] = null;

        int[] arrayInt = new int[] {
                1,2,4,6,543,2,34,5
        };

        //cek longArray
        System.out.println(arrayInt.length);
        //input/ganti nilai array
        arrayInt[1] = 0;
        System.out.println(arrayInt[1]);

        //array
        String[][] members={
                {"1","2","3"},
                {"4","5","6"},
                {"7","8","9"},
        };
        System.out.println(members[2][2]);
    }

}
