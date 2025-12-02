package com.anwar.data_structure_and_algorithm.Arrays.two_pointers;

import java.util.Scanner;

public class Two_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Array Elements in sorted form:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target:");
        int target=sc.nextInt();
        int i=0,j=n-1;
        boolean res=false;
        while(i<=j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                 res=true;
                 break;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }
        System.out.println(res);
    }
}
