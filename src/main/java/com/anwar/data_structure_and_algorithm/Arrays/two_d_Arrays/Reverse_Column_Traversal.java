package com.anwar.data_structure_and_algorithm.Arrays.two_d_Arrays;

import java.util.Scanner;

public class Reverse_Column_Traversal {
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

        //print in  reverse column wise
        System.out.println("printing in  reverse column wise");
        for(int col=0;col<m;col++){
            for(int row=n-1;row>=0;row--){
                System.out.print(mat[row][col] +" ");
            }
            System.out.println();
        }
    }
}
