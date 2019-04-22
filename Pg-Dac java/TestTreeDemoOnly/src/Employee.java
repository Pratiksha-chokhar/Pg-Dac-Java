
public class Employee implements Comparable<Employee> {

	private int empID;
	private String empName;
	private	String empDept;
	
	
	public Employee() {

	}

	public Employee(int empID, String empName, String empDept) {

		this.empID = empID;
		this.empName = empName;
		this.empDept = empDept;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}


	@Override
	public String toString() {
		//return "Not allowed";
		return "[empID=" + empID + ", empName=" + empName + ", empDept=" + empDept + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.empName.compareTo(o.empName);
		

	}
	
	
	
	
	
	
	
}
