package com.anwar.data_structure_and_algorithm.DP;
import java.util.Scanner;

public class LongestCommonSubString {
    public static int LCS(String x,String y, int m,int n){
        int[][] dp=new int[m+1][n+1];
        int maxL=0;//track the maximum length of the substring in entire dp table;
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    maxL=Math.max(maxL,dp[i][j]);
                }else{
                    dp[i][j]=0;
                }
            }
        }
        return maxL;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings");
        String x=sc.nextLine();
        String y=sc.nextLine();
        System.out.println(LCS(x,y,x.length(),y.length()));
    }
}