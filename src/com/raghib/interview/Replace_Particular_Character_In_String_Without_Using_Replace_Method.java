package com.raghib.interview;

public class Replace_Particular_Character_In_String_Without_Using_Replace_Method {
	
	public static void m2(String mystr) {
		//replace a certain character in string without using replace method
		//Apple
		//apphe
		
		String str="";
		char c = ' ';
		char newChar = 'h';
		for(int i = 0; i < mystr.length(); i++) {
			c = mystr.charAt(i);
			if(c == 'l') {
				str += newChar; 
			} else {
				str += c; 
			}
		}
		System.out.println("New String : "+str);
	}  

	public static void main(String[] args) {		
		String str = "Apple";
		m2(str);		
	}
}
