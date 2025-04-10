package quiz;

public class Sales extends Regular {
	int empCommission;
	
	public Sales() {
		
	}
	
	public Sales(int empCommission) {
		super();
		this.empCommission = empCommission;
	}

	public int empCommission(int empSalary) {
		if(this.empDepartment == 1) {
			System.out.println(empSalary);
			return empSalary += (this.empSalary * 0.5);
			
		} else {
			return this.empSalary;
		}
	}
	
	@Override
	public String toString() {
		return "사번: " + this.empNum + "\t이름: " + this.empName + "\t부서: " + this.empDepartment
			+ "\t번호: " + this.empPhone + "\t급여: " + empCommission(this.empSalary);
	}
	

}
