package array2;


// to perform the basic operation on the array
// insertion at the beginning
// insertion at the particular index
// insert after the particular index
// insert before the particular index
public class Main1 {

    public static int[] insertAtBeginning(int[] arr, int value){
        int[] newArr = new int[arr.length+1];
        newArr[0] = value;
        for(int i=0;i<arr.length;i++){
            newArr[i+1] = arr[i];
        }
        return newArr;
    }

    public static int[] insertAtIndex(int[] arr, int index, int value){
        int[] newArr  = new int[arr.length+1];
        for(int i=0;i<index;i++){
            newArr[i] = arr[i];
        }
        newArr[index] = value;
        for(int i = index; i<arr.length;i++){
            newArr[i+1] = arr[i];
        }
        return newArr;
    }

    public static int[] insertAfterIndex(int[] arr, int index, int value){
        return insertAtIndex(arr,index+1, value);
    }


    public static int[] deleteFromBeginning(int[] arr){
        if(arr.length ==0) return arr;
        int[] newArray = new int[arr.length - 1];
        for(int i = 1;i<arr.length; i++){
            newArray[i-1] = arr[i];
        }
        return newArray;
    }

    public static int[] deleteIndex(int[] arr, int index){
        int[] newArr = new int[arr.length  - 1];
        for(int i=0;i<index;i++){
            newArr[i] = arr[i];
        }
        for(int i = index+1;i<arr.length;i++){
            newArr[i-1] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40};
        int n = arr.length;
    }
}
