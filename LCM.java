// Finding the Least Common Multiple (LCM)
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find the LCM of two numbers.
// Example:
// Input: a = 12, b = 15
// Output: 60
// Explanation: The LCM of 12 and 15 is 60.

class LCM{
    public static void main(String args[]){
        int a = 12, b = 15;
        int res = a > b ? a : b;
        while(true){
            if(res%a==0 && res%b==0){
                System.out.println("The LCM of "+a+" and "+b+" is: "+res);
                break;
            }
                res++;
        }
    }
}
