package com.anwar.data_structure_and_algorithm.Sorting;

import java.util.Scanner;

class Insertion_Sort_Impl{
    public static void insertion_sort(int[] arr,int n){
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //declare array and initialize it
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //call sorting alg
         Insertion_Sort_Impl.insertion_sort(arr,n);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
