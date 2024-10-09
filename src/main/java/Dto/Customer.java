package Dto;

public class Customer {
          private long cid;
          private String cusername;
          private String cemail;
          private String cpassword;
          private long cphone;
          private String caddress;
		public Customer(long cid, String cusername, String cemail, String cpassword, long cphone, String caddress) {
			super();
			this.cid = cid;
			this.cusername = cusername;
			this.cemail = cemail;
			this.cpassword = cpassword;
			this.cphone = cphone;
			this.caddress = caddress;
		}
		public long getCid() {
			return cid;
		}
		public void setCid(long cid) {
			this.cid = cid;
		}
		public String getCusername() {
			return cusername;
		}
		public void setCusername(String cusername) {
			this.cusername = cusername;
		}
		public String getCemail() {
			return cemail;
		}
		public void setCemail(String cemail) {
			this.cemail = cemail;
		}
		public String getCpassword() {
			return cpassword;
		}
		public void setCpassword(String cpassword) {
			this.cpassword = cpassword;
		}
		public long getCphone() {
			return cphone;
		}
		public void setCphone(long cphone) {
			this.cphone = cphone;
		}
		public String getCaddress() {
			return caddress;
		}
		public void setCaddress(String caddress) {
			this.caddress = caddress;
		}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cusername=" + cusername + ", cemail=" + cemail + ", cpassword="
					+ cpassword + ", cphone=" + cphone + ", caddress=" + caddress + "]";
		}
		
}
