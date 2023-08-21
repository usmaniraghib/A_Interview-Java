package com.raghib.corejava.hcl;

//HCL

/**
 * Input: hello
 * Output: olleh
 * 
 * @author Asus
 *
 */
public class ReverseWordOfString {	
	
	public static void reverseWord1(String str) {
		System.out.println("reverseWord1() method");
		System.out.println("Without Reverse : " + str);
		String newString = "";
		char c = ' ';
		for(int i=0; i < str.length(); i++) {
			c = str.charAt(i);
			newString = c + newString;
		}
		System.out.println("With Reverse : " + newString);
		System.out.println("");
	}
	
	public static void reverseWord2(String str) {
		System.out.println("reverseWord2() method");
		System.out.println("Without Reverse : " + str);
		String newString = "";
		char c = ' ';

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c != ' ') {
				newString = c + newString;
			}

		}
		System.out.println("With Reverse : " + newString);
		System.out.println("");
	}
	
	public static void reverseWord3(String str) {
		System.out.println("reverseWord3() method");
		System.out.println("Without Reverse : " + str);
		String newString = "";
		char storeChar = ' ';
		for(int i = 0; i < str.length(); i++) {
			storeChar = str.charAt(i);
			newString = storeChar + newString;			
		}
		System.out.println("With Reverse : "+newString);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		String str1 = "raghib";
		String str2 = "usmani";
		String str3 = "Its Simple";
		reverseWord1(str1);
		reverseWord2(str2);
		reverseWord3(str3);
	}

}
