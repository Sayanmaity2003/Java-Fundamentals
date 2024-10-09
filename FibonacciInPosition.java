// Finding the Fibonacci Number at a Specific Position
// Difficulty: Easy
// Topics: Basic Programming, Sequences
// Description: Write a program to find the Fibonacci number at a specific position.
// Example:
// Input: position = 5
// Output: 5
// Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).

class FibonacciInPosition{
    public static void main(String[] args){
        int pos = 5;
        int a = 0, b = 1;
        if(pos==0){
            System.out.print(a);
        }else if(pos==1){
            System.out.print(b);
        }else{
            for(int i=2; i<=pos; i++){
                int c = a + b;
                if(i==pos){
                    System.out.print(c);
                }
                a = b;
                b = c;
            }
        }
    }
}