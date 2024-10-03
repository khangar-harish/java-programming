package com.hash.new_features.interview;

import java.util.ArrayList;
import java.util.List;

public class StringCompressStar {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("abc*d".equalsIgnoreCase(compressor("abcabcd")));
        System.out.println("a*bb*".equalsIgnoreCase(compressor("aabbaabb")));
        System.out.println("ABCD*".equalsIgnoreCase(compressor("ABCDABCD")));
        System.out.println("A**BBBB".equalsIgnoreCase(compressor("AAAABBBB")));
        System.out.println("ABC*E".equalsIgnoreCase(compressor("ABCABCE")));
        System.out.println("AB*C*D".equalsIgnoreCase(compressor("ABABCABABCD")));
        System.out.println("A*A*".equalsIgnoreCase(compressor("AAAAAA")));
        System.out.println("A*A*A".equalsIgnoreCase(compressor("AAAAAAA")));
    }
    public static String compressor(String s){
        int n = s.length();
        char[] ch = s.toCharArray();
        //Step1
        int[] stat = new int[n];
        for(int i=1;i<=n/2;i++){
            String prev = s.substring(0,i);
            String post = s.substring(i,2*i);
            if(prev.equalsIgnoreCase(post))stat[i]=i;
            //The below method is the inbuilt java method to perform above 3 lines
            //if(s.regionMatches(true, 0, s, i, i))stat[i]=i;
        }
        //Step2
        char[] ans = new char[n];
        for(int i=n-1;i>=0;i--){
            if(stat[i]==0)ans[i]=s.charAt(i);
            else{
                if(replaceWithStar(stat,i))ans[i]='*';
                else ans[i]=s.charAt(i);
            }
        }
        return constructString(ans,n);
    }
    public static String constructString(char[] ans,int n){
        //Step3
        StringBuilder sb = new StringBuilder();
        int k=0;
        while(k<n){
            sb.append(ans[k]);
            if(ans[k]=='*'){
                k=(2*k-1);
            }
            k++;
        }
        return sb.toString();
    }
    public static boolean replaceWithStar(int[] stat,int i){
        for(int j=i+1;j<2*i;j++){
            if(stat[j]!=0) return false;
        }
        return true;
    }
}
