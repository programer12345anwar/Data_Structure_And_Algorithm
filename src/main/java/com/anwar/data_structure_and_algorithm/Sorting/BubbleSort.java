package com.anwar.data_structure_and_algorithm.Sorting;

import java.util.Scanner;

import static com.anwar.data_structure_and_algorithm.utility.Swap_Array_Ele.swap;

class Bubble_Sorting_Impl{
    //java does not allow private/protected for top-level classes(not inside another class). Only public and default modifiers are allowed
    public static void bubble_sort(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap->swap method is present in utility package
                     swap(arr,j,j+1);
                }
            }
        }
    }

}

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //declare array and initialize it
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //call sorting alg
        Bubble_Sorting_Impl.bubble_sort(arr,n);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
