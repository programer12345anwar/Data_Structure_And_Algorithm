package com.anwar.data_structure_and_algorithm.DP;

import java.util.Scanner;

public class ShortestCommonSuperSeq {
    public static int LCS(String x,String y, int m,int n){
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static int superSeq(String x, String y, int m, int n){
        return m+n-LCS(x,y,m,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings");
        String x=sc.nextLine();
        String y=sc.nextLine();
        //both should be present as a subsequence after making a new string by concatenating both the string. out task is to make it as sort as possible
        System.out.println(superSeq(x,y,x.length(),y.length()));

    }
}
