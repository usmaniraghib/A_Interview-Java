package com.raghib.corejava.hexaware;

import java.util.regex.Pattern;

/**
 * Input: String str = "welcome to india";
 * Output: india to welcome
 * 
	Hexaware L1 and LTIMintree
 *
 */
/*
REFERENCE :-
https://www.youtube.com/watch?app=desktop&v=Ajac_H8dFoM
https://www.scaler.com/topics/reverse-a-sentence-in-java/
 */

public class ReverseStringSentence {
	
	public static void reverseString1(String str) {
		System.out.println("Before Reverse String : " + str);
		String temp[] = str.split("\\s");
		String newString = "";
		for (int i = 0; i < temp.length; i++) {
			newString = temp[i] + " " + newString;
		}
		System.out.println("After Reverse String : " + newString);
	}
	
	public static void reverseString2(String str) {
		System.out.println("Before Reverse String : "+str);
		Pattern p = Pattern.compile("\\s");
		String temp[] = p.split(str);
		String newString = "";
		for(int i = 0; i < temp.length; i++) {
			if(i == temp.length-1) {
				newString = temp[i] + newString;
			} else {
				newString = " " + temp[i] + newString;
			}
			
		}
		System.out.println("After Reverse String : "+newString);
	}

	public static void main(String[] args) {
		String str = "welcome to india";
		reverseString1(str);
		reverseString2(str);
	}	
}
