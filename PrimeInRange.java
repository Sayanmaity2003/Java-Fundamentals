// Finding Prime Numbers in a Range
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find all prime numbers within a given range.
// Example:
// Input: range = [10, 30]
// Output: [11, 13, 17, 19, 23, 29]
// Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.

import java.util.*;
class PrimeInRange{
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int st = sc.nextInt();
        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();
        for(int i=st; i<=end; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            
        }
    }
}