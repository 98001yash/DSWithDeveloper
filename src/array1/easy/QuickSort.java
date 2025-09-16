package array1.easy;

import java.util.Random;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class QuickSort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int pIdx = low;
        int smallerCount = 0;

        // Count elements smaller than pivot
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] <= pivot) {
                smallerCount++;
            }
        }

        int correctIdx = low + smallerCount;
        swap(arr, pIdx, correctIdx);

        int i = low, j = high;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else swap(arr, i, j);
        }
        return correctIdx;
    }

    public static void QuickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int idx = partition(arr, low, high);
        QuickSort(arr, low, idx - 1);
        QuickSort(arr, idx + 1, high);
    }

    public static int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100000); // numbers up to 1,00,000
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Yash chauhan.......23bcs80339");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of different sizes to test: ");
        int t = sc.nextInt();

        int[] sizes = new int[t];
        System.out.println("Enter " + t + " array sizes (space separated): ");
        for (int i = 0; i < t; i++) {
            sizes[i] = sc.nextInt();
        }

        for (int n : sizes) {
            int[] arr = generateRandomArray(n);

            long start = System.nanoTime();
            QuickSort(arr, 0, n - 1);
            long end = System.nanoTime();

            long timeTaken = end - start;
            System.out.println("Array size: " + n + " | Time taken: " + timeTaken + " ns");
        }

        sc.close();
    }
}
