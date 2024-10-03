// Finding the Factorial of a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to compute the factorial of a given number.
// Example:
// Input: number = 5
// Output: 120
// Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.

class Factorial{
    public static void main(String args[]){
        int number = 5;
        int fact = 1;
        for(int i=1; i<=5; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}