package com.anwar.data_structure_and_algorithm.Sorting;

import java.util.Scanner;

class Quick_Sort_Impl{
    public static int partition(int[] arr, int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;   // return pivot index
    }
    public static void quick_sort(int[] arr,int low, int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quick_sort(arr,low,pi-1);
            quick_sort(arr,pi+1,high);
        }
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
        Quick_Sort_Impl.quick_sort(arr,0,n-1);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
