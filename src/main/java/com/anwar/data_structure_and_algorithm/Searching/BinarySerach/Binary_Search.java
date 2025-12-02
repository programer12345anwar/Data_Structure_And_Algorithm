package com.anwar.data_structure_and_algorithm.Searching.BinarySerach;

import java.util.Scanner;

class Binary_Search_Impl{
    public static int binary_search(int[] arr,int n,int key){
        int i=0,j=n-1;
        while (i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return -1;
    }
}

public class Binary_Search {
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
        int res=Binary_Search_Impl.binary_search(arr,n,key);
        //print
        System.out.println(res);
        sc.close();
    }
}
