// Finding the Greatest Common Divisor (GCD)
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find the GCD of two numbers.
// Example:
// Input: a = 48, b = 18
// Output: 6
// Explanation: The GCD of 48 and 18 is 6.

class GCD{
    public static void main(String args[]){
        int a = 48, b = 18;
        int res = a<b? a : b;
        while(res!=0){
            if(a%res==0 && b%res==0){
                System.out.println("GCD of "+a+" and "+b+" is: "+res);
                break;
            }
            res--;
        }

    }
}