// Crafting Star Patterns
// Difficulty: Easy
// Topics: Basic Programming, Patterns
// Description: Write a program to create different star patterns (e.g., pyramid, diamond).
// Example:
// Input: patternType = "pyramid", height = 5
// Output:
//     *
//    ***
//   *****
//  *******
// *********

class Pyramid{
    public static void main(String args[]){
        int height = 5;
        for(int i=1; i<=height; i++){
            for(int j=1; j<=height-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}