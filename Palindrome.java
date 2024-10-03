// Identifying Palindromes
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to check if a string or number is a palindrome.
// Example:
// Input: string = "radar"
// Output: Palindrome
// Explanation: "radar" reads the same backward as forward.

import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int str_len = str.length();
        int mid = str_len/2;
        int flag = 0;
        for(int i=0; i<mid; i++){
            if(str.charAt(i)!=str.charAt(str_len-i-1)){
                flag = 1;
            }
        }
        if(flag==0){
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is not Palindrome");
        }
    }
}