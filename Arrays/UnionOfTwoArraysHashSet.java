// Union of Two Arrays using HashSet
// Works for UNSORTED arrays
// Time Complexity: O(n + m)
// Space Complexity: O(n + m) [because of HashSet]

import java.util.*;

class UnionOfTwoArraysHashSet {

    public static List<Integer> findUnion(int[] a, int[] b) {

        // HashSet stores only unique elements
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of first array
        for (int x : a) {
            set.add(x);
        }

        // Add all elements of second array
        for (int x : b) {
            set.add(x);
        }

        // Convert Set to List because function returns List
        List<Integer> result = new ArrayList<>(set);

        return result;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        System.out.println(findUnion(a, b));
    }
}
