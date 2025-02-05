public class test14Nov {

    public static void main(String[] args) {
       helloWorld("txt");

    }

    public static void helloWorld(String name) {
        System.out.println("hello word "+name);
        if (name.equals(null)){
            System.out.println("enter valid name");
        };
    }
}


//name = indonesia -> as null, method should print enter valid name insteda hello