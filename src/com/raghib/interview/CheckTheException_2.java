package com.raghib.interview;

class Author {
	String name;
	String address;
	String gender;
	/*
	 * Getting error because;
	 * Number of parameter 
	 * and Type of parameter is same
	 * for both constructor.
	 * 
	Author(String name) {
		this.name = name;
	}
	Author(String gender) {
		this.gender = gender;
	}
	*/
	public Author(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}	
}

class CheckTheException_2 {

	public static void main(String[] args) {		

	}
}
