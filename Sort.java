// Sorting an Array
// Difficulty: Easy
// Topics: Basic Programming, Sorting Algorithms
// Description: Write a program to sort an array of numbers in ascending order.
// Example:
// Input: array = [3, 1, 4, 1, 5, 9]
// Output: [1, 1, 3, 4, 5, 9]
// Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9].

import java.util.Scanner;
class Sort{
    public static void display(int a[]){
        int num = a.length;
        for(int i=0; i<num; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void insertionSort(int x[], int y){
        int temp, j;
        for(int i=1; i<y; i++){
            temp = x[i];
            j = i - 1;
            while(j>=0 && x[j]>temp){
                x[j+1] = x[j];
                j--;
            }
            x[j+1] = temp;
        }    
    
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array: \n");
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int y = arr.length;
        insertionSort(arr, y);
        display(arr);
    }
}