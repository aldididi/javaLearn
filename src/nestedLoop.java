public class nestedLoop {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("\n");

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print("* ");
                if(i==j){break;}
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print("* ");
                if( (i+j) == 4 ){break;}
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                System.out.print("* ");
                if( i == j){
                    break;
                } else if ((i+j) == 8 ) {
                    break;
                }
            }
            System.out.print("\n");
        }

        System.out.println("piramid");

        for (int i=0; i<0; i--){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            } for (int i1=9; i1>i; i--){
                System.out.print("*");
            } for (int i2 = 10; i2>i; i2--){
                System.out.print("*");
            } break;
        }
    }

}
