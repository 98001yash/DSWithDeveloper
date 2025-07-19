package array1;
import java.util.*;

//   Easy level question in this module
public class Largest_element_in_array {

//    public static int largest(int[] arr){      // 1 st approach
//        int n = arr.length;
//        int mx = arr[0];
//        for(int i = 0;i<n;i++){
//            if(arr[i]>mx){
//                mx = arr[i];
//            }
//        }
//        return mx;
//    }

    public static  int largest(int[] arr){   // 2nd approach
        int  n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx = Math.max(arr[i], mx);
        }
        return mx;
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
        System.out.println("Largest element in the arrays is:"+largest(arr));

    }
}
