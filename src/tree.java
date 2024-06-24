import java.util.Stack;

public class tree {
    public static void main(String[] args) {
        int[] push={1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(push));

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)count++;
            else if(nums[i]==0){
                max=Math.max(max,count);
                count=0;
            }
            if(nums[i]==1 && i==nums.length) return count;
        }
        return max;
    }
}
