package array1.easy;

// code for the Quick Sort

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int  partition(int[] arr, int low , int high){
        int pivot  = arr[low], pIdx = low;
        int n = arr.length;
        int smallerCount = 0;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<=pivot){
                smallerCount++;
            }

        }
        int CorrectIdx = low+smallerCount;
        swap(arr,pIdx,CorrectIdx);
        int i = low, j = high;
        while(i<=CorrectIdx && j>CorrectIdx){
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<pivot) swap(arr,i,j);
        }
        return CorrectIdx;
    }
    public static void QuickSort(int[]arr, int low , int high){
        if(low>=high) return;
        int idx = partition(arr,low,high);
        QuickSort(arr,low,idx-1);
        QuickSort(arr,idx+1,high);

    }


    public static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100000);
        }
        return arr;
    }
    public static void main(String[] args) {
//        int[] arr = {80, 30, 50, 20, 60, 10, 70, 40};
//        int n = arr.length;
//        System.out.print("Array before sorting: ");
//        print(arr);
//
//        System.out.print("Array after soring: ");
//        QuickSort(arr, 0, n - 1);
//        print(arr);


        Scanner sc = new Scanner(System.in);

        // Run experiment for multiple n values
        System.out.print("Enter number of different sizes to test: ");
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            System.out.print("Enter size of array (n): ");
            int n = sc.nextInt();

            int[] arr = generateRandomArray(n);

            // Measure time
            long start = System.nanoTime();
            QuickSort(arr, 0, n - 1);
            long end = System.nanoTime();

            long timeTaken = end - start;
            System.out.println("Array size: " + n + " | Time taken: " + timeTaken + " ns");
        }

        sc.close();
    }
    }

