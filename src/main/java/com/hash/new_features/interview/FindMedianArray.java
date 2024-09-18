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

    private static int findMedian(int[] nums1, int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();

        return 0;
    }
}
