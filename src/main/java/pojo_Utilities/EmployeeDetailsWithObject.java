package pojo_Utilities;

public class EmployeeDetailsWithObject {

	//Create  variables globally
		String empname;
		String eid;
		String email;
		long phonenum;
		String address;
		Object SpouseDetails;
		
		// create a constructor for initialisation
		public EmployeeDetailsWithObject(String empname, String eid, String email, long phonenum, String address,
				Object SpouseDetails ) {
        	
			this.empname = empname;
			this.eid = eid;
			this.email = email;
			this.phonenum = phonenum;
			this.address = address;
			this.SpouseDetails = SpouseDetails;
		}
		public EmployeeDetailsWithObject()
		{
			
		}
    // generate getters and setters methods for utilization
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

		public Object getSpouseDetails() {
			return SpouseDetails;
		}

		public void setSpouseDetails(Object SpouseDetails) {
			this.SpouseDetails = SpouseDetails;
		}
		
		
		

	
		
}
