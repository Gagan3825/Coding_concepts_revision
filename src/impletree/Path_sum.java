package impletree;

public class Path_sum {
    public static void main(String[] args) {
     int[] arr={3,4,2,3};

        System.out.println(checkPossibility(arr));
    }
    static boolean checkPossibility(int[] nums) {
        int count=0;
        int i=1;
        while(i<nums.length){
            if(nums[i]>nums[i-1]){
                i++;
            }else if(nums[i]<nums[i-1]){
                nums[i-1]=nums[i]-1;
                count++;
                i++;
            }
            if(i==nums.length){
                if(count==1){
                    return true;
                }
            }
//            i++;
        }
        return false;
    }
}
