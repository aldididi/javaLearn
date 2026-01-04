public class testabcOOP {
    //polymorphism example
    static class Animal{
         void sound(){
            System.out.println("Animal sound");
        }

        static class Dog extends Animal{
           @Override
            void sound(){
                System.out.println("Bark");
            }

        }

        static class cat extends Animal{
            @Override
             void sound(){
                System.out.println("Meow");
            }
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal.cat();
        a.sound();
    }

}
