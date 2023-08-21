package com.raghib.corejava.synechron;

/*
 * 
NOTE - NOT AVAILABLE IN YOUTUBE, SO I WROTE THE LOGIC.

 * COMPANY - synechron
 * 
 * Reverse last word of string.
 */

/**
*
 * Input: String listOfWords = "I am from india";	
 * Output:
Before Reverse Last Word : india
After Reverse Last Word : aidni
I am from aidni
*/ 

public class ReverseLastWordOfStringSentence {
		
	public static String reverseLastWord(String lastWord) {
		System.out.println("Before Reverse Last Word : "+lastWord);
		String reverseString = "";
		char storeChar = ' ';
		for(int i = 0; i < lastWord.length(); i++) {
			storeChar = lastWord.charAt(i);
			reverseString = storeChar + reverseString;	// i -> ni -> dni -> idni -> aidni
		}
		System.out.println("After Reverse Last Word : "+reverseString);
		return reverseString;	//aidni
	}
	
	public static void main(String[] args) {
		String listOfWords = "I am from india";		
		int index = listOfWords.lastIndexOf(" ");//It provide the index of between "from india"	
		String reverseString = reverseLastWord(listOfWords.substring(index+1)); //india		
		System.out.print(listOfWords.substring(0, index)+" "+reverseString);
		
	}

}
