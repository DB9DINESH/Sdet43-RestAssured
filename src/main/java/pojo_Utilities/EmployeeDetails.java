package pojo_Utilities;

public class EmployeeDetails {
 
	//Create a variables globally
	String empname;
	String eid;
	String email;
	long phonenum;
	String address;
	
	//Create a constructor to initialise
	public EmployeeDetails(String empname, String eid, String email, long phonenum, String address) {
		super();
		this.empname = empname;
		this.eid = eid;
		this.email = email;
		this.phonenum = phonenum;
		this.address = address;
	}
	
	public EmployeeDetails()
	{
		
	}
	
	// generate getters and setters to utilisation

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(long phonenum) {
		this.phonenum = phonenum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	

	
	
}
