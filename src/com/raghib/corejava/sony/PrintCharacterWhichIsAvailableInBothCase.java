package com.raghib.corejava.sony;

/*
 
NOTE - NOT AVAILABLE IN YOUTUBE, SO I WROTE THE LOGIC.

https://www.youtube.com/watch?v=13_-JaA1EGA
https://www.youtube.com/watch?v=qJ8GtT1UAJw
https://www.youtube.com/watch?v=W6rCN8Zcikc

COMPANY - SONY  Thru Wipro

Condition-1 -> Print the character which is available in both case (UPPERCASE and LOWERCASE) [A, B, D].

Condition-2 -> Print the Highest character.

*/

/**
*
 * Input: String str1 = "ZzBAbaaDEdCF";
 * 
 * Output:
Inside verifyTheCharacter() Method
CHARACTER AVAILABLE IN BOTH CASES : ZBAAD
REMOVING DUPLICATE CHARACTERS : ZBAD

Inside sortString() Method
SORT THE CHARACTER : ABDZ
PRINT THE BIG CHARACTER : Z
*/ 

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintCharacterWhichIsAvailableInBothCase {
	
	//CONDITION-1
	public static String verifyTheCharacter(String str) {
		System.out.println("Inside verifyTheCharacter() Method");
		
		String newString = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			//System.out.println("Is LowerCase : "+Character.isLowerCase(c));
			//System.out.println("Is UpperCase : "+Character.isUpperCase(c));
			if(Character.isLowerCase(c)) {
				//System.out.println("Under Is Lowercase");
				char convertToUpper = Character.toUpperCase(c);
				//System.out.println("convertToUpper : "+convertToUpper);
				for(int j = i+1; j < str.length()-1; j++) {
					char nextCharacter = str.charAt(j);
					if(convertToUpper == nextCharacter) {
						//System.out.println("Yes its available");
						newString += c;
					}
				}
			} else {
				//System.out.println("Under Is Uppercase");
				char convertToLower = Character.toLowerCase(c);
				//System.out.println("convertToLower : "+convertToLower);
				for(int j = i+1; j < str.length()-1; j++) {
					char nextCharacter = str.charAt(j);
					if(convertToLower == nextCharacter) {
						//System.out.println("Yes its available");
						newString += c;
					}
				}
			}
		}
		String result = newString.toUpperCase();
		System.out.println("CHARACTER AVAILABLE IN BOTH CASES : "+result);		
		
		//REMOVING DUPLICATE CHARACTERS
		StringBuilder stringBuilderObj = new StringBuilder();
		Set<Character> setObj = new LinkedHashSet<Character>();
		
		//ADDING CHARACTER INTO SET OBJECT
		for(int i = 0; i < result.length(); i++) {
			setObj.add(result.charAt(i));	//SET DOESNOT ALLOW DUPLICATE VALUE.
		}
		
		//ASSIGNING SET VALUE IN STRING BUFFER OBJECT
		for(Character c : setObj) {
			stringBuilderObj.append(c);
		}
		
		System.out.println("REMOVING DUPLICATE CHARACTERS : "+stringBuilderObj);
		return stringBuilderObj.toString();
	}
	
	//CONDITION-2
	public static void sortString(String str) {
		System.out.println("");
		System.out.println("Inside sortString() Method");
		//CONVERTING STRING TO CHARACTER ARRAY
		char[] ch = str.toCharArray();
		
		//SORTING CHARACTER ARRAY
		Arrays.sort(ch);
		
		//ASSIGNING SORTED VALUE IN STRING
		String sortedString = new String(ch);
		System.out.println("SORT THE CHARACTER : "+sortedString);
		
		//PRINTING LAST CHARACTER
		System.out.println("PRINT THE BIG CHARACTER : "
		+sortedString.charAt(sortedString.length()-1));		
	}

	public static void main(String[] args) {
		String str1 = "ZzBAbaaDEdCF";
		//String str1 = "aBAbF";
		
		sortString(verifyTheCharacter(str1));		
	}
}
