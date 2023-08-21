package com.raghib.interview;

import java.util.Scanner;

/**
 * REFERENCE:-
 * https://www.youtube.com/watch?v=z0_Rcl6yBpQ
 * https://www.youtube.com/watch?v=kbvt6Ikk8no
 * 
 * Palindrome Word -> mam, madam, radar, 121, 1221.
 * Not a Palindrome Word -> hello, hi, 123.
 * @author Asus
 *
 */
public class Palindrome {
    public static void main(String[] args) {
    	checkStringPalindrome("mam");
    	checkStringPalindrome("madam");
    	checkStringPalindrome("radar");
    	checkStringPalindrome("hello");
    	checkStringPalindrome("hi");
    	
    	checkIntegerPalindrome(121);
    	checkIntegerPalindrome(1221);
    	checkIntegerPalindrome(123);
    	
    	checkPalindrome();
    }
    
    public static void checkStringPalindrome(String str) {
    	String word = str;
        String revWord = "";
        char c = ' ';
        
        for(int i = 0; i < word.length(); i++) {
        	c = word.charAt(i);
        	revWord = c + revWord;
        }        
        
        if (word.equalsIgnoreCase(revWord)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
    
    public static void checkIntegerPalindrome(int value) {
    	int temp = value;
        int revNum = 0;
        int rem = 0;
        
        while(temp != 0) {
        	rem = temp%10;
        	revNum = revNum*10+rem;
        	temp = temp/10;
        }
   
        if (value==revNum) {
            System.out.println(value + " is a palindrome.");
        } else {
            System.out.println(value + " is not a palindrome.");
        }
    }

    public static void checkPalindrome() {
    	String firstString = "", secondString = "";
        char c = ' ';
        System.out.print("Please provide the string value to Reverse, as well as to check its Palindrom or not after reverse : ");
        try (Scanner scannerObject = new Scanner(System.in)) {
			firstString = scannerObject.nextLine();
		}
        System.out.println("Original String : "+firstString);
        for(int i = firstString.length()-1; i >= 0 ; i--){
            c = firstString.charAt(i);
            secondString += c;
        }

        if(secondString.equals(firstString)){
            System.out.println("Its a Palindrom : "+secondString);
        } else {
            System.out.println("Its not a Palindrom : "+secondString);
        }
    }
}
