package com.javaex.problem02;

public class Depart extends Employee {

    //코드작성
	private String department;

	//기본 생성자
	public Depart() {
		super();
		// TODO Auto-generated constructor stub
	}

	//인자값이 존재하는 생성자
	public Depart(String name, int salary , String department) {
		super(name, salary); //받아온 인자를 부모생성자에게 넘겨서 초기화
		this.department = department;  //자신에게 있는 멤버변수 초기화
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getInformation() {
		System.out.println("이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서 :" + department);
	}
	
	

	
}
