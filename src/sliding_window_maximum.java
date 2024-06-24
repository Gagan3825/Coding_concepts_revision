import java.util.ArrayList;

public class sliding_window_maximum {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        System.out.println(maxSlidingWindow(nums,3));

    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> li=new ArrayList();
        ArrayList<Integer>res=new ArrayList();
        int i=0,j=0;
        int maxwindow=0;
        int ans=0;
        while(j<nums.length){


            if(j-i+1<k){
                j++;
                li.add(nums[j]);
            }
            else if(j-i+1==k){
                ans=maxnum(li);
                res.add(ans);
                nums[j]-=nums[i];
                i++;
                j++;


            }

        }
        // System.out.println(li);
        int[] output=new int[li.size()];
        System.out.println(res);
        return output;
    }
    static int maxnum(ArrayList<Integer>li){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<li.size();i++){
            maxi=Math.max(maxi,li.get(i));

        }
        return maxi;
    }
}
