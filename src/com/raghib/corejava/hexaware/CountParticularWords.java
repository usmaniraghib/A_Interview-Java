package com.raghib.corejava.hexaware;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Input: 
 		String str = "welcome to indiawelcometo india india is great county";
   
   Output: 3
   
 * Hexaware L2 Round
 */


public class CountParticularWords {
	
	public static void countParticularWord(String str, String findWord) {
		int i = 0;
		Pattern p = Pattern.compile(findWord);
		Matcher m = p.matcher( str );
		while (m.find()) {
		i++;
		}
		System.out.println(i);
	}

	public static void main(String[] args) {
		String str = "welcome to indiawelcometo india india is great county";
		String findWord = "india";
		countParticularWord(str,findWord);
	}
}