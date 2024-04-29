package com.allianz.inheritance;

abstract class Employee {
	public int id;
	public String name;

	public void printEmployeeDetails() {
		System.out.println(id);
		System.out.println(name);
	}

	public abstract double calculateSalary();
}

class PermanentEmployee extends Employee {

	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 3000 * 30;
	}
}

class ContractEmployee extends Employee {

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 8 * 1000 * 100;
	}

}

public class Demo2AbstractClass {
	public static void main(String[] args) {

		Employee e = new PermanentEmployee();
		e.printEmployeeDetails();
		System.out.println(e.calculateSalary());

		e = new ContractEmployee();
		e.printEmployeeDetails();
		System.out.println(e.calculateSalary());

	}

}
