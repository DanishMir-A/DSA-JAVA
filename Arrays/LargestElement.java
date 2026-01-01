// Problem: Largest Element in an Array
// Pattern: Array
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LargestElement {
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        System.out.println(largest(arr));
    }
}
