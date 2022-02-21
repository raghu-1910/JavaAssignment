package casestudy3;

public class Employee {
	private String empname;
	private int empcode;
	private String empmail;
	private int empsalary;
	private String empadd;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public Employee(int empname, int empcode, String empmail, int empsalary, String empadd) {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empname, int empcode, String empmail, int empsalary, String empadd) {
		super();
		this.empname = empname;
		this.empcode = empcode;
		this.empmail = empmail;
		this.empsalary = empsalary;
		this.empadd = empadd;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empcode=" + empcode + ", empmail=" + empmail
				+ ", empsalary=" + empsalary + ", empadd=" + empadd + "]";
	}
	

}
