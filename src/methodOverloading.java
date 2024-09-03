

//method dengan nama sama berulangkali (parameter harus berbeda2)
public class methodOverloading {
    public static void main(String[] args) {
            //2 reproduce methods
        hello();
        hello("diduy");
        hello("didi", "dudu");
    }
// 1 create method
    static void hello(){
        System.out.println("hello");
    }

    static void hello(String name){
        System.out.println("hello "+ name);
    }

    static void hello(String fName, String lastName){
        System.out.println("hello "+ fName + lastName);
    }
}
