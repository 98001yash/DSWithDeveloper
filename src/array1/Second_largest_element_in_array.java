package array1;

public class Second_largest_element_in_array {

//    public static int printSecondLargest(int[] arr){ // 1st approach
//        int n = arr.length;
//        int mx = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            mx = Math.max(mx, arr[i]);
//        }
//        int smx = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i]!=mx){
//                smx = Math.max(smx,arr[i]);
//            }
//        }
//        return smx;
//    }
public static int printSecondLargest(int arr[])
{   // 2nd approach
    int n = arr.length;
    int prev = -1, curr = arr[0];
    for (int i = 1; i < n; i++)
    {
        if (arr[i] > curr)
        {
            prev = curr;
            curr = arr[i];
        }
        else if (arr[i] > prev && arr[i] != curr)
            prev = arr[i];
    }
    return prev;
}


    public static void main(String[] args){
        int[] arr = {2,3,4,6,8,9,10};
        System.out.println("second largest element is: "+printSecondLargest(arr));
    }
}
