package com.anwar.data_structure_and_algorithm.Searching.BinarySerach;

import java.util.Scanner;

class Binary_Search_Desc_Impl{
    public static int binary_search(int[] arr,int n,int target){
        int low=0,high=n-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                high=mid-1;
            }else{
               low=mid+1;
            }
        }
        return -1;
    }
}

public class BinarySerachForDesc {
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
        //call binary search alg
        int res=Binary_Search_Desc_Impl.binary_search(arr,n,key);
        //print
        System.out.println(res);
        sc.close();
    }
}
