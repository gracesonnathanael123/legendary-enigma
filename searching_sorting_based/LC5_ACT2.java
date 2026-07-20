package searching_sorting_based;
public class LC5_ACT2 {
	public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 5, 6, 7};
        int n = array.length;
        if (n == 0 || n == 1) {
            System.out.println("Array contains 0 or 1 element.");
            return;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[n - 1];
        System.out.println("Output array without duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
