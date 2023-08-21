package com.raghib.corejava.vaisesika;

/**
* Vaisesika L2 Round
 * Input: String str = "7hi5 i5 7h3 7ex7 t0 b3 c0nv3r73d";
 * Output: hi i h ex t b cnvrd
*
*/ 

public class RemoveAllDigitFromString {	
	public static void revInt(String str) {		
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))) {
				result = result + str.charAt(i);				
			}
		}
		System.out.println(result);	
	}
	public static void main(String[] args) {
		String str = "7hi5 i5 7h3 7ex7 t0 b3 c0nv3r73d";
		revInt(str);
		}
}
