package com.allianz.employee;

public class EmployeeRunner {
	
	public static void main(String[] args) {
		
		Employee.companyName="Allianz";
		
		Employee emp1=new Employee();
		Employee emp2=new Employee(102);
		Employee emp3=new Employee(103,"Jack");
		Employee emp4= Employee.getEmployeeInstance();
		emp4.displayEmployeeDetails();
		
		Employee.getEmpDetail(emp3);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		//emp1.empId=101;
		emp1.empName="Saul";
//		emp1.empSalary=-1000.2;
		emp1.setEmpSalary(-90);
		emp1.setEmpMobileNumber(-90);
		
		//emp2.empId=102;
		emp2.empName="Kim";
//		emp2.empSalary=8000;
		emp2.setEmpSalary(10000);
		emp2.setEmpMobileNumber(9876543213L);
	
		
		emp2.displayEmployeeDetails();
		emp1.displayEmployeeDetails();
		emp3.displayEmployeeDetails();
		
		Employee.printAuthorName();
		
		System.out.println(emp2.getSalary());
		
		
		Employee[] arr=new Employee[2];
		arr[0]=emp1;
		arr[1]=emp2;
		
		
		System.out.println(arr[0]);
		
	}

}
