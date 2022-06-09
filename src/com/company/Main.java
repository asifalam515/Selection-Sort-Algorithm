package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	//selection sort algorithm
        int []arr={3,1,5,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void selectionSort(int []arr){
        for (int i = 0; i < arr.length ; i++) {
            //find the max item int the remaining array and swap with the correct index
     int last=arr.length-i-1;
     int maxIndex=getmaxIndex(arr,0,last);
    swap(arr,maxIndex,last);
        }
    }
static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
}
     static int getmaxIndex(int[] arr, int start, int end ) {
        int max=start;
         for (int i = start; i <=end ; i++) {
             if (arr[max]<arr[i]){
                 max=i;
             }
             
         }
         return  max;
    }
}
