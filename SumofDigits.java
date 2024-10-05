// Summing Digits of a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to calculate the sum of digits of a number.
// Example:
// Input: number = 1234
// Output: 10
// Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.

import java.util.Scanner;
class SumofDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;
        while(temp!=0){
            int rem = temp%10;
            sum += rem;
            temp = temp/10;
        }
        System.out.println("Sum of the digits of "+num+" is: "+sum);
    }
}