package com.raghib.interview;

import java.util.Arrays;

public class SortArray {

	public static void m1(int[] arr) {
		System.out.println("m1() method - Using Arrays.sort() ");
		
		System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

	public static void m2(int[] arr, int size) {
		System.out.println("");
		System.out.println("m2() method - Using Custom Logic");
		System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
		int temp;
		//Array Sorting Logic Added Below
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
	
	public static int m3(int[] arr, int size) {
		System.out.println("");
		System.out.println("m3() method");
		System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");
		int temp;
		//Array Sorting Logic Added Below
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {
		int[] a1 = { 0, 8, 3, 14, 15 };
		int[] a2 = { 00, 88, 33, 1414, 1515 };
		int[] a3 = { 000, 888, 333, 141414, 151515 };
		m1(a1);
		m2(a2, 5);
		System.out.println("Smallest value of array : "+m3(a3, 5));
	}
}
