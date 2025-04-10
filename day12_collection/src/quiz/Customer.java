package quiz;

// 고객번호,
// no, name, address, phone
// 생성자함수, setter getter method
// ArrayList or Vector 이용해서
// 고객추가(add) 고객삭제 (remove) 고객리스트출력(for enum...), 고객수정(set) 프로그램 종료(0)

public class Customer {
	int no;
	String name;
	String address;
	String phone;
	
	public Customer() {
		
	}
	
	public Customer(int no, String name, String address, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "[고객 번호: " + no + " 고객 이름: " + name + " 고객 주소: " + address + " 고객 번호: " + phone + "]";
	}
	
	
	
	
	
}
