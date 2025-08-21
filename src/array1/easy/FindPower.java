
package array1.easy;
import java.util.Scanner;

public class FindPower {
    public static long power(long base, long exp) {
        if (exp == 0) { // base case
            return 1;
        }
        long half = power(base, exp / 2); // recursive call
        if (exp % 2 == 0) {
            return half * half;
        } else {
            return base * half * half;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the base number: ");
        long base = sc.nextLong();

        System.out.print("Enter the power (exponent): ");
        long exp = sc.nextLong();

        // Compute power
        long result = power(base, exp);

        // Display result
        System.out.println(base + "^" + exp + " = " + result);

        sc.close();
    }
}


// Finding the frequency of the element in the array

//package array1.easy;
//import java.util.*;
//
//public class FindPower {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 1, 4, 2};
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
//        }
//    }
//}
