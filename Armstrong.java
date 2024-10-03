// Calculating Armstrong Numbers
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to check if a number is an Armstrong number.
// Example:
// Input: number = 153
// Output: Armstrong Number
// Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

import java.util.*;
class Armstrong{
    public static void main(String args[]){
        int num = 153;
        int temp = num;
        int sum = 0;
        while(temp!=0){
            int rem = temp%10;
            sum += Math.pow(rem,3);
            temp = temp/10;
        }
        if(sum==num){
            System.out.println(num+ " is a armstrong number");
        }else{
            System.out.println(num+ " is not a armstrong number");
        }
    }
}