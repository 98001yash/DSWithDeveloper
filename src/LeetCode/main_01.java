package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

// majority element
public class main_01 {

    public static int majorityElement(int[] arr){
        int candidate = arr[0];
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(count==0){
                candidate = arr[i];
                count = 1;
            }else if(arr[i]==candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        return candidate;
    }

    public static int majorityElement2(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(arr, 0) + 1);

            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement2(arr));
    }
}
