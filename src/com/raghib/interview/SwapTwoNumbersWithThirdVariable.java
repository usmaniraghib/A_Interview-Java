package com.raghib.interview;

/**
 * Reference:-
 * https://www.youtube.com/watch?v=vlpLfHIsGCk
 * 
 */

public class SwapTwoNumbersWithThirdVariable {

	public static void main(String[] args) {
		int a=10,b=20,temp=0;
		System.out.println("Before Swap");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		temp = a; //10
		a = b; //20
		b = temp; //10
		System.out.println("After Swap");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}