import java.util.ArrayList;
import java.util.List;

public class checkArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 5, 6, 7};

        List<Integer> duplicates = findDuplicates(array1, array2);
        System.out.println("Duplicates: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] array1, int[] array2) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && !duplicates.contains(array1[i])) {
                    duplicates.add(array1[i]);
                }
            }
        }
        return duplicates;
    }
}
