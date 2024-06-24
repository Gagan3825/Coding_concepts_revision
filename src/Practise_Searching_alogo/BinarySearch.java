package Practise_Searching_alogo;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,5,100,105};
        int t=100;
        int index=binarSearch(arr,t);
        System.out.println(index);
    }

    private static int binarSearch(int[] arr, int t) {
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==t)return mid;
            else if (t>arr[mid]) {
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
}
