package com.allianz.employee;

public class Employee {
	private int empId;
	public String empName;
	private double empSalary;
	private long empMobileNumber;
	public static String companyName;
	
	public Employee()
	{
		empId=101;
	}
	
	public Employee(int empId)
	{
		System.out.println(this);
		this.empId=empId;
		System.out.println("Object created!!!");
		System.out.println("Browser launch!");
	}
	public Employee(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println("Object created!!!");
		System.out.println("Browser launch!");
	}
	public Employee(double empId)
	{

		System.out.println("Object created!!!");
		System.out.println("Browser launch!");
	}
	public Employee(String empName,int empId)
	{
		this.empId=empId;
		this.empName=empName;
		System.out.println("Object created!!!");
		System.out.println("Browser launch!");
	}
	
	
	public void displayEmployeeDetails()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(getEmpMobileNumber());
		System.out.println(Employee.companyName);
		System.out.println("--------------------------------");
	}
	
	public static void printAuthorName()
	{
		
	}
	
	//write or set method
	public void setEmpSalary(double empSalary) {
		
		System.out.println(empName);
		if(empSalary>1000)
		{
			this.empSalary=empSalary;
		}
		else {
			System.out.println("Salary Should be greater than 0");
		}
	}
	
	public double getSalary()
	{
		return empSalary;
	}

	public long getEmpMobileNumber() {
		return empMobileNumber;
	}

	public void setEmpMobileNumber(long empMobileNumber) {
		
		if(String.valueOf(empMobileNumber).length()==10)
//		if(empMobileNumber>=100000000 && empMobileNumber<=9999999999L)
		{
			this.empMobileNumber = empMobileNumber;
		}
		else
		{
			System.out.println("Mobile Number should be 10 digit");
		}
	}
	
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee();
		return e;
	}
	
	public static void getEmpDetail(Employee e)
	{
		System.out.println(e.empId);
		System.out.println(e.empName);
	}

}






