public class homeWork2 {
    public static void main(String[] args) {
       main();
    }

    static void main(){
        String[] penumpang = {"aan", "budi", "irawan","dowi","asd","asda","ggsd","diasd","223","asdad"};
        String[] seat = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int index=0;

        for(int baris=1; baris<= 4; baris++){
            for(String bangku : seat){
                if(index < penumpang.length){
                    String penumpank = penumpang[index];
                    System.out.println(penumpank + " -> " + baris + bangku);
                    index++;
                } else {
                    break;
                }
            }

            }
        }
    }
