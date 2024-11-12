import java.util.Scanner;

public class longestSequenceSDETtest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        String[] arr = input.split(", ");
        int[] arrInt = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        for (int i=0; i<arrInt.length - 1; i++) {
            for (int j=0; j<arrInt.length - 1 - i; j++) {
                if (arrInt[j] > arrInt[j+1]) {
                    int temp = arrInt[j];
                    arrInt[j] = arrInt[j+1];
                    arrInt[j+1] = temp;
                }
            }
        }

        int result = 1;
        int pivot = arrInt[0];
        for (int j=1; j<arrInt.length; j++) {
            if (arrInt[j] - pivot == 1) {
                result++;
                pivot = arrInt[j];
            }
        }
        System.out.println(result);
    }
}
