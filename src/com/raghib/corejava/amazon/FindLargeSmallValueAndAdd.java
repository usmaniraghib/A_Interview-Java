package com.raghib.corejava.amazon;

/*

COMPANY - Amazon India Thru Wipro

https://www.youtube.com/watch?v=d6TZfZ_K3nM
https://www.youtube.com/watch?v=XtDmnzlrWKo

Two digit format

Input:
25,89,53,90,61,91,27,83,17,24
 
Output:
sum the digits of a highest number is 91 (9+1=10) 
sum the digits of a smallest numbers is 17 (1+7=8)

*/

public class FindLargeSmallValueAndAdd {

	public static void findSmallestLargest(int[] arrVal) {
		int smallestValue = arrVal[0];
		int largestValue = arrVal[0];
		for(int i = 1; i < arrVal.length; i++) {
			//Find Lowest Value
			if(arrVal[i] < smallestValue) {
				smallestValue = arrVal[i];
			}
			//Find Largest Value
			if(arrVal[i] > largestValue) {
				largestValue = arrVal[i];
			}
		}
		System.out.println("Smallest Value : "+smallestValue);
		System.out.println("Largest Value : "+largestValue);
		
		int sumSmall = 0,remSmall = 0;
		while(smallestValue > 0) {
			remSmall = smallestValue%10;	//TO FIND OUT REMINDER
			sumSmall += remSmall;			//ADD REMINDER INTO SUM
			smallestValue = smallestValue/10;	//CHANGE VALUE OF SMALLESTVALUE NUMBER VARIABLE	
		}
		System.out.println("Sum of small value : "+sumSmall);
		
		int sumLarge = 0,remLarge = 0;
		while(largestValue > 0) {
			remLarge = largestValue%10;
			sumLarge += remLarge;
			largestValue = largestValue/10;			
		}
		System.out.println("Sum of large value : "+sumLarge);		
	}

	public static void main(String[] args) {
		int[] intArray = new int[] {25,89,53,90,61,91,27,83,17,24};
		findSmallestLargest(intArray);

	}

}
