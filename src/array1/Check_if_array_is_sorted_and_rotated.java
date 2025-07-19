package array1;


// leetcode- 1752
public class Check_if_array_is_sorted_and_rotated {

    public static boolean sortedAndRotated(int[] nums){
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]) count++;
        }
        if(count==0) return true;
        else if(count==1 && nums[0]>nums[n-1]) return true;
        else return false;
    }
    public static void main(String[] args){

        int[] arr = {2,1,3,4};
        System.out.println(sortedAndRotated(arr));
    }
}
