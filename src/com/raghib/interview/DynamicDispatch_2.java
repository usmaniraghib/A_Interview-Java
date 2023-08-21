package com.raghib.interview;

class Pqr {
	protected String greet(String message) {
		return message.toLowerCase();
	}
}

class Lmn extends Pqr {
	public String greet(String message) {
		return message.toUpperCase();
	}
}

class DynamicDispatch_2 {
	public static void main(String[] args) {
		Lmn l = new Lmn();
		System.out.println(l.greet("Hello"));
	}
}

//OUTPUT - HELLO
