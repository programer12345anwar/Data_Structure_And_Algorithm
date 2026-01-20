package com.anwar.data_structure_and_algorithm.DP;
import java.util.Scanner;

public class PrintLCS {
    public static String helper(String x, String y, int m, int n,int[][] dp){
        int i=m,j=n;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                sb.append(x.charAt(i-1));
                i--;
                j--;
            }else{
                if(dp[i][j-1]>dp[i-1][j]) j--;
                else i--;
            }
        }
        return sb.reverse().toString();
    }
    public static void LCS(String x,String y, int m,int n){
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
        System.out.println(helper(x,y,m,n,dp));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings");
        String x=sc.nextLine();
        String y=sc.nextLine();
        LCS(x,y,x.length(),y.length());
    }
}
