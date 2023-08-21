package com.raghib.interview;

/**
*
 * Input: "my code1 code"
 * Output: code
* 
*/ 

public class PrintRepeatingCharacterOnly {
	
	public static void printDuplicateChar(String str) {		
		char[] ch = str.toCharArray();		
		for(int i=0; i < str.length(); i++) {
			for(int j=i+1; j< str.length(); j++) {
				if(ch[i] == ch[j]) {
					System.out.print(ch[j]);
					break;
				}
			}
		}
		System.out.println();
	}
	
	public static void printDuplicateChar1(String str) {
		for(int i=0; i < str.length(); i++) {
			char chi = str.charAt(i);
			for(int j=i+1; j< str.length(); j++) {
				char chj = str.charAt(j);
				if(chi == chj) {
					System.out.print(chi);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		printDuplicateChar("my code1 code");
		printDuplicateChar1("maheshbabu");
	}
}
