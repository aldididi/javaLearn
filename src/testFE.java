public class testFE {

    public static void main(String[] args) {
       helloWorld("asd");

    }

    public static void helloWorld(String name) {
        System.out.println("hello word "+name);
        if (name.equals(null)){
            System.out.println("enter valid name");
        };
    }
}


//name = indonesia -> as null, method should print enter valid name insteda hello