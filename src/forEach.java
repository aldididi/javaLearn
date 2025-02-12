public class forEach {
    public static void main(String[] args) {
        String[] names ={
                "mamang", "kesbor", "mardial", "reza", "arap", "aaa", "ii"
        };

        for (var i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("foreach");

        for (var name : names){
            System.out.println(name);
        }
    }
}
