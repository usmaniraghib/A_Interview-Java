package com.raghib.corejava.hcl;

//HCL

/*
REFERENCE :-
https://stackoverflow.com/questions/45436599/input-a2b3c4-and-output-aabbbcccc
 */

/**
 * Input: String str = "a1b2cd3";
   Output: abbcddd

 * Reference -> thru ChatGPT

In Java programming, the statement s.charAt(i) - 48 
is used to convert a character that represents a digit (0-9) 
into its corresponding numerical value. 
This technique assumes that the character s.charAt(i) contains a digit character.

Here's a breakdown of what's happening:
s.charAt(i): This part retrieves the character at the i-th position in the string s. 
This character is assumed to be a digit character (0-9).

- 48: In the ASCII character encoding, the character '0' has a decimal value of 48. 
Subtracting 48 from the ASCII value of the digit character results in getting the actual numerical value of the digit.

For example, if s.charAt(i) is '5', then the ASCII value of '5' is 53. 
Subtracting 48 from 53 gives you the numerical value 5.

Here's how the conversion works for a few examples:
If s.charAt(i) is '0', then '0' - 48 = 0
If s.charAt(i) is '5', then '5' - 48 = 5
If s.charAt(i) is '9', then '9' - 48 = 9

This technique is often used when you want to convert a character-based digit into 
its corresponding integer value for further calculations or operations. 
However, it's worth noting that there are more convenient and readable ways to achieve this conversion in Java, 
such as using Character.getNumericValue() method or 
by directly subtracting the character '0' (which is equivalent to 48 in ASCII) from the character.
*/

public class PrintNumberOfCharacterBasedOnDigit {
	
	public static void printChar1() {
		String s = "a1b2cd3";
		for(int i = 0; i < s.length(); i++) {
	        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
	            System.out.print(s.charAt(i));
	        }else{
	        	/*
	        	 * - 48: In the ASCII character encoding, the character '0' has a decimal value of 48. 
						Subtracting 48 from the ASCII value of the digit character results in getting the actual numerical value 
						of the digit.
	        	 */
	            int a = s.charAt(i) - 48;
	            for(int j = 1; j < a; j++) {
	                System.out.print(s.charAt(i-1));
	            }
	        }
	    }
		System.out.println("");
	}
	
	public static void printChar2() {
		String s = "a1b2cd3";
		for(int i = 0; i < s.length(); i++) {
	        if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
	            System.out.print(s.charAt(i));
	        }else{
	        	/*
	        	 * directly subtracting the character '0' (which is equivalent to 48 in ASCII) from the character.
	        	 */
	            int a = s.charAt(i) - '0';
	            for(int j = 1; j < a; j++) {
	                System.out.print(s.charAt(i-1));
	            }
	        }
	    }
		System.out.println("");
	}
	
	public static void printChar3(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			} else {
				/*
	        	 * using Character.getNumericValue() method.
	        	 */
				int a = Character.getNumericValue(str.charAt(i));
				for(int j = 1; j < a; j++) {				
					System.out.print(str.charAt(i-1));
				}
			}			
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		String str = "a1b2cd3";
		System.out.println("printChar1() Method");
		printChar1();
		System.out.println("printChar2() Method");
		printChar2();
		System.out.println("printChar3() Method");
		printChar3(str);
	}
}
