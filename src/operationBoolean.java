public class operationBoolean {
    public static void main(String[] args) {
        var matkul1 =75;
        var matkul2 = 80;

        boolean lulusAbsen = matkul1 >= 73;
        boolean lulusNilai = matkul2 >= 80;
        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
