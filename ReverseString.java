// Reversing a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to reverse a given string.
// Example:
// Input: string = "programming"
// Output: "gnimmargorp"
// Explanation: The reversed string of "programming" is "gnimmargorp".

class ReverseString{
    public static void main(String args[]){
        String str = "programming";
        int str_len = str.length();
        String res = "";
        for(int i=str_len-1; i>=0; i--){
            res += str.charAt(i);
        }
        System.out.println("The reversed string of \""+str+"\" is \""+res+"\"");
    }
}