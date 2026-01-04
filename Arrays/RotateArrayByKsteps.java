// LeetCode 189 - Rotate Array
//optimal approach
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k,a n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


// LeetCode 189 - Rotate Array
// Brute Force Approach
// Time: O(n * k), Space: O(1)

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // handle large k

        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];

            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }

            nums[0] = last;
        }
    }
}
