package array1;

import java.util.Scanner;

public class CalculateGCD {

    //   Brute force approach

//    public static int gcd(int a, int b){
//        int result = 1;
//        for(int i = 1;i<Math.min(a,b); i++){
//            if(a%i==0 && b%i==0){
//                result = i;
//            }
//        }
//        return result;
//    }



    // solving through euclid approach
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(gcd(x,y));

    }
}
