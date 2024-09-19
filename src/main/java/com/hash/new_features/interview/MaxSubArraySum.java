package com.hash.new_features.interview;

public class MaxSubArraySum {

    public static void main(String[] args) {
        // Example array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Find and print the maximum subarray sum
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(nums));
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum1(nums));
    }

    private static int maxSubArraySum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    private static int maxSubArraySum1(int[] nums) {
        int maxSum = nums[0], currentSum = 0;
        int start = 0, end = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if(currentSum < 0){
                currentSum = 0;
                temp = i + 1;
            }
            //maxSum = Math.max(maxSum, currentSum);
            if (currentSum > maxSum){
                maxSum = currentSum;
                start = temp;
                end = i;
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i]+ " ");
        }
        return maxSum;
    }
}
