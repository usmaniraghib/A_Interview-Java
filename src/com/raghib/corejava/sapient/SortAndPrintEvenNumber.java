package com.raghib.corejava.sapient;

import java.util.*;
import java.util.stream.Collectors;

/**
*
 * Input: [80, 1, 24, 3]

 * Output: [24, 80]
*
*Sapient - System Test
*/ 
public class SortAndPrintEvenNumber {

	public static void main(String[] args) {
		way1();
		//way2();		
	}
	
	public static void way1() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(80);
		al.add(1);
		al.add(24);
		al.add(3);		
		System.out.println(al);
		
		List<Integer> al1 = 
				al
				.stream()
				.filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		Collections.sort(al1);
		System.out.println(al1);
	}
	
	public static void way2() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Please provide The Size Of List : ");
			int n = Integer.parseInt(scan.nextLine());
			
			int i = 0;
			List<Integer> list = new ArrayList<Integer>();	
			System.out.println("Please provide the list of number which are trying to sort & find the even number : ");
			while (i < n) {
				list.add(Integer.parseInt(scan.nextLine()));
				i++;
			}
			findEvennumber(list);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	public static void findEvennumber(List<Integer> arrayList) {
		System.out.println(arrayList);
		
		List<Integer> list1 = 
				arrayList.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());
		
		Collections.sort(list1);
		System.out.println(list1);
	}
}

