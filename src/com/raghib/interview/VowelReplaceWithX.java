package com.raghib.interview;

/**
*
 * Input: String str = "my name is raghib usmani";
 * Output: String Value : my nxmx xs rxghxb xsmxnx
*
*/ 

public class VowelReplaceWithX {
	
	public String m1() {
		String str = "my name is raghib usmani";
		
		String newStr = "";
		char c = ' ';
		String newChar = "x";
		
		//Using while loop
//		int i = 0;
//		while(i < str.length()) {
//			c = str.charAt(i);
//			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
//				newStr += newChar; 
//			} else {
//				newStr += c;
//			}
//			i++;
//		}
		
		//Using for loop
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				newStr += newChar;
			} else {
				newStr += c;
			}
		}
		
		return newStr;
	}
	
	public static void main(String[] args) {
		VowelReplaceWithX t1 = new VowelReplaceWithX();
		String res = t1.m1();
		System.out.println("String Value : "+res);
	}
}

