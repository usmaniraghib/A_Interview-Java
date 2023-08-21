package com.raghib.interview;

class Abc {
	String name;
	Abc(String name){
		this.name = name;
	}
}

class Xyz extends Abc {
	String nickName;
	Xyz(String nickName){
		//Need to add this statement then error will gone. - super(nickName);
		super(nickName);
		this.nickName = nickName;
	}
}

class CheckTheException_4 {
	public static void main(String[] args) {		

	}
}
