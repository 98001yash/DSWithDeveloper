package array1;

import java.util.Scanner;

public class count_digit {

    public static int countDigit(int n){
        int count = 0;
        while(n>0) {
            int digit = n % 10;
            count++;
            n /= 10;
        }
         return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countDigit(n));
    }
}
