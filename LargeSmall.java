// Finding the Largest and Smallest Numbers in an Array
// Difficulty: Easy
// Topics: Basic Programming, Arrays
// Description: Write a program to find the largest and smallest numbers in an array.
// Example:
// Input: array = [4, 7, 1, 8, 5]
// Output: Largest: 8, Smallest: 1
// Explanation: The largest number in the array is 8 and the smallest is 1.

class LargeSmall{
    public static void main(String args[]){
        int arr[] = {4, 7, 1, 8, 5};
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Largest: "+max);
        System.out.println("Smallest: "+min);
    }
}