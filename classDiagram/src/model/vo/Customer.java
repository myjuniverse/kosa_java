package model.vo;

public class Customer {
	private int CustomerCode;
	private String CustomerName;
	private String CustomerAddress;
	private String CustomerPhone;
	
	public Customer() {}
	
	public Customer(int customerCode, String customerName, String customerAddress, String customerPhone) {
		super();
		CustomerCode = customerCode;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		CustomerPhone = customerPhone;
	}

	public int getCustomerCode() {
		return CustomerCode;
	}

	public void setCustomerCode(int customerCode) {
		CustomerCode = customerCode;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public String getCustomerPhone() {
		return CustomerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		CustomerPhone = customerPhone;
	}
	
}
