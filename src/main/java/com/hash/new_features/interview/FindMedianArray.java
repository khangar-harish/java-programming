package com.hash.new_features.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMedianArray {

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));  // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(findMedianSortedArrays(nums3, nums4));  // Output: 2.5
    }

    private static int findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < m && j < n){
            if(nums1[i] < nums2[j]){
                list.add(nums1[i++]);
            }else {
                list.add(nums2[j++]);
            }
        }
        while (i < m) list.add(nums1[i++]);
        while (j < n) list.add(nums2[j++]);

        //list.forEach(System.out::println);

        if(list.size()/2 == 1){
            return list.get(list.size()/2);
        }else {
            return (list.get(list.size() / 2) + list.get(list.size() / 2 - 1))/2;
        }

    }

    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array for efficiency
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays1(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int totalLeft = (m + n + 1) / 2;  // Total number of elements on the left side

        int left = 0, right = m;

        while (left <= right) {
            int partition1 = left + (right - left) / 2;
            int partition2 = totalLeft - partition1;

            // Elements immediately to the left and right of the partition
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            // Check if we have a valid partition
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If the total number of elements is odd, return the max of left side
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                }
                // If even, return the average of max of left side and min of right side
                return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
            }
            // Adjust the binary search range
            else if (maxLeft1 > minRight2) {
                right = partition1 - 1;  // Move to the left in nums1
            } else {
                left = partition1 + 1;  // Move to the right in nums1
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
