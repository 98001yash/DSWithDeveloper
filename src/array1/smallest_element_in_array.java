package array1;

import java.util.Scanner;

public class smallest_element_in_array {

//    public static int smallest(int[] arr){    1st approach
//        int n = arr.length;
//        int min = arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        return min;
//    }

    public static int smallest(int[] arr){    // 2nd approach
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter all the element in the array:");{
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Largest element in the arrays is:"+smallest(arr));

    }
}
