package com.anwar.data_structure_and_algorithm.Searching.BinarySerach;

import java.util.Scanner;

class First_Occurrence_Last_Occurrence_Impl {
    public static int first_occurance(int[] arr,int n,int target){
        int low=0,high=n-1;
        int resF=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                resF=mid;
                high=mid-1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return resF;
    }
    public static int last_occurance(int[] arr,int n, int target){
        int low=0,high=n-1;
        int resL=-1;
        while (low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==target){
                resL=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return resL;
    }
}

public class FirstOccurrenceLastOccurrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the array:");
        int n=sc.nextInt();
        //declare array and initialize it
        int[] arr=new int[n];
        System.out.println("Enter array elements in sorted order:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key value:");
        int key=sc.nextInt();
        //call binary search alg
        System.out.println(First_Occurrence_Last_Occurrence_Impl.first_occurance(arr,n,key));
        System.out.println(First_Occurrence_Last_Occurrence_Impl.last_occurance(arr,n,key));

        sc.close();
    }
}
