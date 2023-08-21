package com.raghib.corejava.synechron;


/*
 * COMPANY - synechron
 * 
https://www.youtube.com/watch?v=sPAT_DbvDj0

ques -> question
asf -> answer so far

qlpart -> questionLeftPart
qrpart -> questionRightPart
roq -> restOfQuestion
 */

/**
*
 * Input: String str = "dog";
 * Output:
dog
dgo
odg
ogd
gdo
god

*/ 

public class Permutations {
	
	public static void executePermutation(String question, String answer) {
		for(int i = 0; i < question.length(); i++) {
			char ch = question.charAt(i);
			String questionLeftPart = question.substring(0, i);
			String questionRightPart = question.substring(i + 1);
			String restOfQuestion = questionLeftPart + questionRightPart;
			executePermutation(restOfQuestion, answer + ch);
		}
		
		if(question.length() == 0) {
			System.out.println(answer);
			return;
		}
	}
	
	public static void main(String[] args) {
		String str = "dog";
		String emptyString = "";
		executePermutation(str,emptyString);
	}
}
