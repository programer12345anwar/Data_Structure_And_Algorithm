package com.anwar.data_structure_and_algorithm.Searching.BinarySerach;

import java.util.Scanner;

public class BinarySearchForAscOrDesc {
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
        //check array is asc or desc
        boolean asc=false,desc=false;
        if(arr[0]<arr[1]){
            asc=true;
        }else{
            desc=true;
        }
        //call binary search alg
        if(asc){
            System.out.println(Binary_Search_Impl.binary_search(arr,n,key));
        }else{
            System.out.println(Binary_Search_Desc_Impl.binary_search(arr,n,key));
        }
        sc.close();
    }
}
