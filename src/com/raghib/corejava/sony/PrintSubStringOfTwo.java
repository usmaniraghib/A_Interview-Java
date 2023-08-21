package com.raghib.corejava.sony;

/*

NOTE - NOT AVAILABLE IN YOUTUBE, SO I WROTE THE LOGIC.

COMPANY - SONY Thru Wipro

INPUT :- "zyzyzyzyzyzy"

OUTPUT :-
Sub String of 2 : 
ab
bc
cd
de
ef
fg
*/

public class PrintSubStringOfTwo {

	public static void main(String[] args) {
		String str = "abcdefg";
		System.out.println("Sub String of 2 : ");
		for(int i = 0; i < str.length()-1; i++) {						
			System.out.println(str.substring(i, i+2));		
		}
	}
}
