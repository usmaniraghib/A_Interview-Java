package com.raghib.interview;

class Book {
	String title;
	int pages;
	double price;
	Book(String title, int pages, double price) {
		super();
		this.title = title;
		this.pages = pages;
		this.price = price;
	}	
}

class CheckTheException_1 {
	public static void main(String[] args) {
		/*
		 * There is no default constructor define and we are using below.
		 * Thats why we are getting error.
		 * 
		 Book b1 = new Book();
		 */
		Book b1 = new Book("Learn Automation", 300, 750d);
		System.out.println(b1.title);
		System.out.println(b1.pages);
		System.out.println(b1.price);
	}
}
