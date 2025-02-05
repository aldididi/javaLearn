

//berfungsi untuk mengirim data yang berjumlah ga tentu/0. hanya bisa digunakan di akhir parameter
//variabel argument nanti akan diterima sebagai array
public class methodVariableArgument {
    public static void main(String[] args) {
        //2. data array biasa, untuk diproses di congrats
//        int[] values= {80,50,50,50,80};
//        congrats("aldy", values);

        congrats("budi", 80,90,76,80);
    }

    //1 function congrats
    //pakai variabel value int...
    //tidak pakai "int[] values"
    static void congrats(String name, int... values){
        var total =0;
        for (var value: values){
            total += value;
        }

        var finalValue = total/values.length;
        if (finalValue >= 75){
            System.out.println("congrats " + name +" passed");
        } else {
            System.out.println("sorry "+ name +" not passed");
        }
    }
}
