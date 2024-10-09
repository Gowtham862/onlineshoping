package Dto;

public class Product {
	private int productid;
	private String productname;
	private String productcategory;
	private String productprice;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public Product(int productid, String productname, String productcategory, String productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productcategory = productcategory;
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productcategory="
				+ productcategory + ", productprice=" + productprice + "]";
	}
	
	

}
