package com.javaex.problem02;

public class Depart extends Employee {

    //코드작성
	private String department;

	public Depart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depart(String name, int salary , String department) {
		super(name, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getInformation() {
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서 :" + department);
	}
	
	

	
}
