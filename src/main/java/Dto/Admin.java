package Dto;

public class Admin {
	 private String adminemail;
	 private String adminpassword;
	 private int adminid;
	 public Admin(String adminemail,String adminpassword,int adminid)
	 {
		 this.adminemail=adminemail;
		 this.adminpassword=adminpassword;
		 this.adminid=adminid;
	 }
	 public void setadminemail(String adminemail)
	 {
		 this.adminemail=adminemail;
	 }
	 public String getadminemail()
	 {
		return adminemail;
		 
	 }
	 public void setadminpassword(String adminpassword)
	 {
		 this.adminpassword=adminpassword;
	 }
	 public String getadminpassword()
	 {
		return adminpassword;
		 
	 }
	 public void setadminid(int adminid)
	 {
		 this.adminid=adminid;
	 }
	 public int getadminid()
	 {
		return adminid;
		 
	 }
	@Override
	public String toString() {
		return "Admin [adminemail=" + adminemail + ", adminpassword=" + adminpassword + ",adminid="+adminid+"]";
	}

}
