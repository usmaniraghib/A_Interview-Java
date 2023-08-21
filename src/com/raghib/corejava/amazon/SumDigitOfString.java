package com.raghib.corejava.amazon;

/*
COMPANY - Amazon India Thru Wipro

https://www.youtube.com/watch?v=stSn0c35q8s
https://www.youtube.com/watch?v=ayzu1sECuy4

Find the sum of numbers from the string.

Input:
String str = "A3B2C4D9E3F3G7";
String[] strArray = {"2AA","12","ABC","c1a1"}; 

Output:
Sum Of The Digit : 31
Sum of array string value : 7

 */
public class SumDigitOfString {

	public static void stringDigitSum(String str) {
		String num = "";
		int sum = 0;
		char digitCharacter = ' ';
		for(int i = 0; i < str.length(); i++) {
			digitCharacter = str.charAt(i);
			
			//To filter the digit
			if(Character.isDigit(digitCharacter)) {
				num += digitCharacter;  
			}
			
			//For addition of digit
			if(!num.equals("")) {
				sum += Integer.parseInt(num);
				num = "";	//CLEAR THE NUM VARAIBALE
			}			
		}
		System.out.println("Sum Of The Digit : "+sum);
	}
	
	public static void stringDigitSumArray(String[] args) {
		String newString = "";
		int sum = 0;		
		char digitCharacter = ' ';
		for(int i = 0; i < args.length; i++) {
			newString = args[i];	//VALUE OF I INDEX
			for(int j = 0; j < newString.length(); j++) {
				digitCharacter = newString.charAt(j);
				if(Character.isDigit(digitCharacter)) {
					sum += Integer.parseInt(digitCharacter+"");
				}
				
			}
		}
		System.out.println("Sum of array string value : "+sum);
	}

	public static void main(String[] args) {
		String str = "A3B2C4D9E3F3G7";		
		String[] strArray = {"2AA","12","ABC","c1a1"}; 
		
		stringDigitSum(str);
		stringDigitSumArray(strArray);
	}
}
