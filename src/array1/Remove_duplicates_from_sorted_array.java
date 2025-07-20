package array1;

// leetcode  26
public class Remove_duplicates_from_sorted_array {
    public static int removeDuplcates(int[] nums){
        if(nums.length==0) return 0;

        int i =0;
        for(int j=01;i<nums.length;j++){
            if(nums[i]!=nums[j]) i++;
            nums[i] = nums[j];
        }
        return i+1;
    }
    public static void main(String[] args) {

    }
}
