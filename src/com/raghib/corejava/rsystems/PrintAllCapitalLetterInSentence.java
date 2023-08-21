package com.raghib.corejava.rsystems;

/**
 * Input: String str = "BIG brown fox jump over LAzy DoG";
   Output: BIGLADG

 * RSystem - L2
 *
 */
public class PrintAllCapitalLetterInSentence {

	public static void main(String[] args) {

		String str = "BIG brown fox jump over LAzy DoG";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}

	}
}
