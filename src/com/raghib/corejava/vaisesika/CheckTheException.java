package com.raghib.corejava.vaisesika;

import java.util.ArrayList;

//Vaisesika L1

public class CheckTheException {

	public static void main(String[] args) {
		String s1 = "Hi";
		s1 = "Hello";
		System.out.println(s1);
		System.out.println("************");
		
		int[] a1 = {1,2,3,4,5};
		//int[] a2 = {1,2,3,4,5,"A"};
		int[] a3 = {1,2,3,4,5,'A'};
		//int[] a4 = {1,2,3,4,5.5f};
		//int[] a5 = {1,2,3,4,5.5};
		
		for(int res : a1) {
			System.out.print(res +" ");
		}
		System.out.println("");
		System.out.println("************");
		for(int res : a3) {
			System.out.print(res +" ");
		}
		System.out.println("");
		System.out.println("************");
		
//		List<> al1 = new ArrayList<>();
//		al1.add(1);
//		al1.add(99);
//		al1.add(784);
//		al1.add(001);
//		al1.add(890);
//		System.out.println(al1);
//		System.out.println("************");
		
//		ArrayList<> al2 = new ArrayList<>();
//		al2.add(1);
//		al2.add(99);
//		al2.add(784);
//		al2.add(001);
//		al2.add(890);
//		System.out.println(al2);
//		System.out.println("************");
		
		ArrayList<Integer> al3 = new ArrayList<>();
		al3.add(1);
		al3.add(99);
		al3.add(784);
		al3.add(001);
		al3.add(890);
		System.out.println(al3);
		System.out.println("************");
		
		ArrayList<Integer> al4 = new ArrayList<>();
		al4.add(1);
		//al4.add("Raghib");
		//al4.add(new Integer("Raghib"));	//Exception at Runtime - NumberFormatException
		al4.add(784);
		al4.add(001);
		//al4.add('A');
		//The constructor Integer(int) has been deprecated since version 9 and marked for removal
		//al4.add(new Integer('A'));	//Print ASCII Value Of 'A' Character
		System.out.println(al4);
		System.out.println("************");
	}

}
