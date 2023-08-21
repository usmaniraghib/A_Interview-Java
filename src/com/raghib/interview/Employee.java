package com.raghib.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//PRINT THE NAME OF THE EMPLOYEE WHOSE AGE IS 30.

public class Employee{
	private long empId;
	private String name;
	private int age;
	
	public Employee(long empId, String name, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"A",30));
		empList.add(new Employee(2,"B",35));
		
		List<Employee> empInfo = 
				empList.stream()
				.collect(Collectors.toList());		
		empInfo.forEach(e -> System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getAge()));
		
		List<Employee> ageResult = 
				empList.stream()
				.filter(e -> e.getAge() > 30)
				.collect(Collectors.toList());		
		ageResult.forEach(e -> System.out.println("Employee Age Greater Than 30 : "+e.getName()));	

	}

}
