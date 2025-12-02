package com.anwar.data_structure_and_algorithm.Sorting;

import java.util.Scanner;

class Quick_Sort_Impl{
    public static int helper(int[] arr, int i,int j){
        return  0;
    }
    public static void quick_sort(int[] arr,int n){

    }
}

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //declare array and initialize it
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //call sorting alg
        Quick_Sort_Impl.quick_sort(arr,n);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
