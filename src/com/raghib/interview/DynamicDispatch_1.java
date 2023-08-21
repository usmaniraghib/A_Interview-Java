package com.raghib.interview;

class Pqr1 {
	public String greet(String message) {
		return message.toLowerCase();
	}
}

class Lmn1 extends Pqr1 {
	public String greet(String message) {
		return message.toUpperCase();
	}
}

class DynamicDispatch_1 {
	public static void main(String[] args) {
		Pqr1 l = new Lmn1();
		System.out.println(l.greet("Hello"));
	}
}

//OUTPUT - HELLO