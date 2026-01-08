// LeetCode 268 - Missing Number
// Optimal Solution using XOR (One Loop)
// Time Complexity: O(n)
// Space Complexity: O(1)

class MissingNumberXOR {

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        // Start XOR with n because loop runs only from 0 to n-1
        int xor = n;

        // XOR index and array value together
        for (int i = 0; i < n; i++) {
            xor = xor ^ i ^ nums[i];
        }

        // The remaining value is the missing number
        return xor;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums)); // Output: 2
    }
}
