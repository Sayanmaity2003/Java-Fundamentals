// Generating Multiplication Tables
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to generate multiplication tables for a given number.
// Example:
// Input: number = 4
// Output:
// 4 x 1 = 4  
// 4 x 2 = 8  
// 4 x 3 = 12  
// 4 x 4 = 16  
// 4 x 5 = 20  

class MultipliTable{
    public static void main(String args[]){
        int num = 4;
        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}