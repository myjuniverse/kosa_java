package quiz;

import java.util.Scanner;

public class Employee {
	int empNum;
	String empName;
	int empDepartment;
	String empPhone;

	public Employee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번: ");
		this.empNum = sc.nextInt();
		
		System.out.print("이름: ");
		this.empName = sc.next();
		
		System.out.print("부서(1. 영업/2. 회계/3. 개발): ");
		this.empDepartment = sc.nextInt();
//		if(this.empDepartment > 3 && this.empDepartment < 0)
		
		System.out.print("연락처: ");
		this.empPhone = sc.next();
		
	}
	
	public Employee(int empNum, String empName, String empGrade, int empDepartment, String empPhone) {
		super();
		this.empNum = empNum;
		this.empName = empName;
		this.empDepartment = empDepartment;
		this.empPhone = empPhone;
	}

	// getter setter
	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(int empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	

}
