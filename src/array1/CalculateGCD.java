//package array1;
//
//import java.util.Scanner;
//
//public class CalculateGCD {
//
//    //   Brute force approach
//
////    public static int gcd(int a, int b){
////        int result = 1;
////        for(int i = 1;i<Math.min(a,b); i++){
////            if(a%i==0 && b%i==0){
////                result = i;
////            }
////        }
////        return result;
////    }
//
//
//
//    // solving through euclid approach
//
//    public static int gcd(int a, int b){
//        while(b!=0){
//            int temp = b;
//            b = a%b;
//            a = temp;
//        }
//        return a;
//    }
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        System.out.println(gcd(x,y));
//
//    }
//}


//package array1;
//import java.util.Arrays;
//
//public class CalculateGCD {
//    public static int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//        for(int i = 0; i < n - 1; i++) {
//            for(int j = i + 1; j < n; j++) {
//                if(nums[i] + nums[j] == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return new int[] {};
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {2, 4, 5, 6, 7, 8, 9};
//        int target = 9;
//        System.out.println(Arrays.toString(twoSum(nums, target)));
//    }
//}



//          Solve  using HashMap
//package array1;
//import java.util.*;
//public class CalculateGCD {
//    public static int[] findSum(int[] nums, int target){
//        int[] ans = {-1,-1};
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<nums.length;i++){
//            int rem = target - nums[i];
//            if(map.containsKey(rem)){
//                int j = map.get(rem);
//               ans[0] = i;
//               ans[1] = j;
//               break;
//            }
//            else map.put(nums[i],i);
//        }
//        return ans;
//    }
//        public static void main(String[] args) {
//            int[] nums = {2, 7, 11, 15};
//            int target = 9;
//
//            int[] result = findSum(nums, target);
//            System.out.println(Arrays.toString(result));
//        }
//}




// Move Zeroes to the end of the Array
// leetcode = 283


//package array1;
//public class CalculateGCD {
//
//    public static void print(int[] arr){
//        int n =arr.length;
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public static void moveZeroes(int[] nums){
//        int lastNonZeroIndex = 0;
//
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] !=0){
//                nums[lastNonZeroIndex++] = nums[i];
//            }
//        }
//
//        while(lastNonZeroIndex< nums.length){
//            nums[lastNonZeroIndex++] = 0;
//        }
//
//    }
//    public static void main(String[] args){
//
//        int[] arr = {0,3,7,8,1,0,0,4};
//        print(arr);
//        moveZeroes(arr);
//        print(arr);
//
//    }
//
//}


//  Leetcode 283

package array1;
public class CalculateGCD {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex++] = nums[i];
            }
        }
        while (lastNonZeroIndex < nums.length) {
            nums[lastNonZeroIndex++] = 0;
        }
    }
    public static void main(String[] args){

    }
}