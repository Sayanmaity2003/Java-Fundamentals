// Counting Vowels and Consonants in a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to count vowels and consonants in a given string.
// Example:
// Input: string = "hello world"
// Output: Vowels: 3, Consonants: 7
// Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).

class VowelCons{
    public static void main(String args[]){
        String str = "hello world";
        int str_len = str.length(), cons = 0, vowel = 0;
        for(int i=0; i<str_len; i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                cons++;
            }else if(ch!=' '){
                vowel++;
            }
        }
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonant: "+cons);
    }
}