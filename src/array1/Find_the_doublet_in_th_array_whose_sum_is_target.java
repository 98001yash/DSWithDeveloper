package array1;

public class Find_the_doublet_in_th_array_whose_sum_is_target {
    public static void main(String[] args){

        int[] arr = {2,4,6,8};
        int n = arr.length;
        int target = 10;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
