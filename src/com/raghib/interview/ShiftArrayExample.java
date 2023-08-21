package com.raghib.interview;

/**
*
 * Input: Input Array: 1 2 3 4 5 6 7 

 * Output: Output Array: 5 6 7 1 2 3 4 
*
*/ 

/*
REFERENCE :- CHATGPT

In this program, the shiftArray method takes the input array and the number of positions to shift as arguments. 
It creates a new array to store the shifted elements and calculates the new index for each element after shifting. 
The % operator is used to ensure that the new index wraps around when it exceeds the length of the array.

The printArray method is used to print the contents of an array.

When you run this program with the provided input array {1, 2, 3, 4, 5, 6, 7} 
and shiftBy value of 3, it will output the shifted array {5, 6, 7, 1, 2, 3, 4}.
 */
public class ShiftArrayExample {
	
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int shiftBy = 3; // Number of positions to shift

        int[] outputArray = shiftArray(inputArray, shiftBy);

        System.out.print("Input Array: ");
        printArray(inputArray);

        System.out.print("Output Array: ");
        printArray(outputArray);
    }

    // Method to shift array elements to the right by 'shiftBy' positions
    public static int[] shiftArray(int[] arr, int shiftBy) {
        int[] shiftedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int newIndex = (i + shiftBy) % arr.length;
            shiftedArray[newIndex] = arr[i];
        }
        return shiftedArray;
    }

    // Method to print the contents of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}