package in.nit.model;

public class Employee {
	
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDept;
	private String empAddrs;
	
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDept=" + empDept
				+ "]";
	}

	private Integer getEmpId() {
		return empId;
	}

	private void setEmpId(Integer empId) {
		this.empId = empId;
	}

	private String getEmpName() {
		return empName;
	}

	private void setEmpName(String empName) {
		this.empName = empName;
	}

	private Double getEmpSal() {
		return empSal;
	}

	private void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	private String getEmpDept() {
		return empDept;
	}

	private void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
		
	     

}
