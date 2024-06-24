package Practise_sorting_algo;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void bubblesort(int[] arr) {
        boolean swap;
        for(int i=0;i< arr.length;i++){
            swap=false;
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }

            }
            if (!swap) break;
        }
    }
}
