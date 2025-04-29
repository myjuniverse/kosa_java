package model.vo;

public class Product {
	private int productCode;
	private String productName;
	private int productPrice;
	
	public Product() {}
	
	public Product(int productCode, String productName, int productPrice) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
	    return getProductCode() + "\t" + getProductName() + "\t" + getProductPrice();
	}

	
}
