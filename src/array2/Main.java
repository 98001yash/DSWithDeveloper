package array2;

import java.util.Arrays;

public class Main {
    public static int missingNumber(int[] nums){

        //using gauss formula
        int n = nums.length;
        int expectedSum = n * (n+1) /2;
        int actualSum  = 0;
        for(int num:nums){
            actualSum +=num;
        }
        return expectedSum -  actualSum;
    }

    // using XOR to find missing number
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    // using sorting technique
    public static int missingNumberUsingSorting(int[] nums) {
        Arrays.sort(nums);  // O(n log n)

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length;
        System.out.println(missingNumber(nums));
        System.out.println(findMissingNumber(nums));
        System.out.println(missingNumberUsingSorting(nums));

    }
}
