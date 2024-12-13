import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 6, 5, 6};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (arr[i] != i + 1) {
                int correctIndex = arr[i] - 1;

                // Handle duplicates: If the current position already has the correct value, break
                if (arr[i] == arr[correctIndex]) {
                    break;
                }

                // Swap to place the element at its correct position
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
