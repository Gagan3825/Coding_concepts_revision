package Practise_Searching_alogo;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr={5,8,6,200,105,100,305,1420};
        int t=100;
        int index=linearsearch(arr,t);
        System.out.println(index);

    }

    private static int linearsearch(int[] arr, int t) {
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==t)index=i;
        }
        return index;
    }
}
