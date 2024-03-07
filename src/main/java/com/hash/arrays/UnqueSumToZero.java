package com.hash.arrays;

public class UnqueSumToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] sumZero(int n) {
        int[] ans = new int[n];
        int loop = n;
        int mid = n/2;
        for(int i=0; i<loop; i++){
            ans[i] = mid - n + 1;
            n--;
        }
        return ans;
    }
}
