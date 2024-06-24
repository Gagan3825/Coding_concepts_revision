package Practise_sorting_algo;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionsort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int lastindex= arr.length-i-1 ;
            int maxindex=MaxIndex(arr,0,lastindex);
            swap(arr,maxindex,lastindex);

        }
    }

    static void  swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    private static int MaxIndex(int[] arr, int start, int lastindex) {
        int maxi=start;
        for (int i = start; i <=lastindex ; i++) {
            if (arr[maxi]<arr[i]){
                maxi=i;
            }

        }
        return maxi;
    }
}
