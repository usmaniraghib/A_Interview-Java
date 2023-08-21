package com.raghib.interview;

import java.util.*;

public class P4_Enumeration {

	public static void main(String[] args) {
		printVectorValue();
		printHashTableValue();

	}

	public static void printHashTableValue() {
		// Creating an empty hashtable
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		// Inserting key-value pairs into hash table
		// using put() method
		ht.put(1, "Geeks");
		ht.put(2, "for");
		ht.put(3, "Geeks");

		// Direct
		System.out.println("\nDirect");
		System.out.println("Elements are: " + ht);

		// Using Enumeration
		System.out.println("\nUsing Enumeration:");
		// Now creating an Enumeration object
		// to read elements
		Enumeration<String> e = ht.elements();

		// Condition holds true till there is
		// single key remaining

		// Printing elements of hashtable
		// using enumeration
		while (e.hasMoreElements()) {
			// Printing the current element
			System.out.println(e.nextElement());
		}
	}

	public static void printVectorValue() {
		// Create a vector
		Vector<String> vec = new Vector<String>();
		// Adding elements using add() method of List
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		// Adding elements using addElement() method of Vector
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");

		// Direct
		System.out.println("Direct");
		System.out.println("Elements are: " + vec);

		// Using Enumeration
		System.out.println("\nUsing Enumeration:");
		// Creating an object of enum
		Enumeration<String> en = vec.elements();
		while (en.hasMoreElements()) {
			// Print the elements using enum object
			// of the elements added in the vector
			System.out.println(en.nextElement());
		}
	}

}
