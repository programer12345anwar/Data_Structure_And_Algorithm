package com.anwar.data_structure_and_algorithm.Sorting;

import com.anwar.data_structure_and_algorithm.utility.Swap_Array_Ele;

import java.util.Scanner;

class Selection_Sort_Impl{
    public static void selection_sort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int k=i;//assume first element is smallest (k is a minIndex)
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            //swap
            Swap_Array_Ele.swap(arr,i,k);
        }
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //declare array and initialize it
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //call sorting alg
         Selection_Sort_Impl.selection_sort(arr,n);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
