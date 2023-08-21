package com.raghib.interview;

class House{
	
	String address;
	int flatNo;
	int noOfYears;
	
	House(String address, int flatNo, int noOfYears) {
		super();
		this.address = address;
		this.flatNo = flatNo;
		this.noOfYears = noOfYears;
	}

	House(int flatNo, int noOfYears) {
		//OUTPUT null 7 25		
//		this.flatNo = flatNo; 
//		this.noOfYears = noOfYears;		 
		
		//OUTPUT null 0 0
		House h = new House("NA",flatNo,noOfYears);
		System.out.println("h Object : "+h);//com.raghib.interview.House@4617c264
	}	
}

class CheckTheException_3 {
	public static void main(String[] args) {
		House house = new House(7,25);
		System.out.println(house.address);
		System.out.println(house.flatNo);
		System.out.println(house.noOfYears);
	}
}
