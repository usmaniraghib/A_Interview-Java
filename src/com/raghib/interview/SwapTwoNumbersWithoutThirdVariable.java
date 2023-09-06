package com.raghib.interview;

/**
 * Reference:-
 * https://www.youtube.com/watch?v=vlpLfHIsGCk
 * 
 */

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swap");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		a = a+b; //10 + 20 = 30
		b = a-b; //30 - 20 = 10
		a = a-b; //30 - 10 = 20
		System.out.println("After Swap");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}