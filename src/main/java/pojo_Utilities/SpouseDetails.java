package pojo_Utilities;

public class SpouseDetails {

	//Create a variables globally
	String sname;
	String sid;
	String semail;
	long sphonenum;
	String saddress;
	
	//create constructor for initialisation
	public SpouseDetails(String sname, String sid, String semail, long sphonenum, String saddress) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.semail = semail;
		this.sphonenum = sphonenum;
		this.saddress = saddress;
	}
	public SpouseDetails()
	{
		
	}
	

	//generate getters and setters method for utilsation
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public long getSphonenum() {
		return sphonenum;
	}

	public void setSphonenum(long sphonenum) {
		this.sphonenum = sphonenum;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	
	
}
