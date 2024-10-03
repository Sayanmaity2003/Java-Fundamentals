// Generating the Fibonacci Series
// Difficulty: Easy
// Topics: Basic Programming, Sequences
// Description: Write a program to generate the Fibonacci series up to a given number.
// Example:
// Input: limit = 10
// Output: [0, 1, 1, 2, 3, 5, 8]
// Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].

import java.util.Scanner;
class Fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int a = 0, b = 1;
        if(num==0){
            System.out.print(a+" ");
        }else{
            System.out.print(a+" ");
            System.out.print(b+" ");
            for(int i=1; i<=num; i++){
                int c = a + b;
                if(c<=num){
                    System.out.print(c+" ");
                }else{
                    break;
                }
                a = b;
                b = c;
            }
        }
    }
}