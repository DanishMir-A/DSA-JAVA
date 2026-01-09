//sliding window approach
class Solution {
    public int longestSubarraySumK(int[] nums, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Shrink window if sum becomes greater than k
            while (sum > k) {
                sum -= nums[left];
                left++;
            }

            // Check if we got sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}
