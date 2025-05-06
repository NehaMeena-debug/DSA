public class maximumSubArray {
    public int maxSubArray(int[] nums) {
        int l = nums.length;
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < l; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
