package com.anwar.data_structure_and_algorithm.Arrays.two_d_Arrays;

import java.util.Scanner;

public class Zig_Zag_R_Odd {
    public static void main(String[] args) {
        //build matrix
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and column");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat=new int[n][m];
        //read values
        System.out.println("Reading the matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        //print in  row wise
        System.out.println("printing in  odd rows elements only");
        for(int i=0;i<n;i++){
            if(i%2==1){
                continue;
            }
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
    }
}
