package com.anwar.data_structure_and_algorithm.Sorting;

import java.util.Scanner;

class Merge_Sort_Impl{
    public static void merging(int[] arr,int low,int mid,int high){

    }
    public static void merge_sort(int[] arr, int low, int high){
        if(low<high){
            int mid=low+(high-low)/2;
            //Recursively split
            merge_sort(arr,low,mid);
            merge_sort(arr,mid+1,high);
            //merge
            merging(arr,low,mid,high);
        }
    }
}

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //declare array and initialize it
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //call sorting alg
         Merge_Sort_Impl.merge_sort(arr,0,n-1);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
