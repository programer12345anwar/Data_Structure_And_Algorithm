package com.anwar.data_structure_and_algorithm.utility;

public  class Swap_Array_Ele {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
