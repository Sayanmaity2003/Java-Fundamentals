// Checking for Armstrong Numbers in a Range
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find all Armstrong numbers within a given range.
// Example:
// Input: range = [1, 500]
// Output: [1, 153, 370, 371, 407]
// Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.

import java.util.*;
class ArmstrongNumberInRange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int st = sc.nextInt();
        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();
        for(int i=st; i<=end; i++){
            int num = i;
            int temp = num;
            int sum = 0;
            while(temp>0){
                int rem = temp%10;
                sum += Math.pow(rem,3);
                // System.out.print(sum +" ");
                temp = temp/10;
            }
            if(sum==num){
                System.out.print(num+" ");
            }
        }
    }
}