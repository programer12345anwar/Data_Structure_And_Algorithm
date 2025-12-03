package com.anwar.data_structure_and_algorithm.Searching.BinarySerach;

import java.util.Scanner;

public class CountElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n=sc.nextInt();
        //declare array and initialize it
        int[] arr=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key value:");
        int key=sc.nextInt();
        //call binary search alg to find count of an element in sorted array
        //first occurrence-last occurrence+1
        System.out.println((First_Occurrence_Last_Occurrence_Impl.last_occurance(arr,n,key)-First_Occurrence_Last_Occurrence_Impl.first_occurance(arr,n,key))+1);
        sc.close();
    }
}
