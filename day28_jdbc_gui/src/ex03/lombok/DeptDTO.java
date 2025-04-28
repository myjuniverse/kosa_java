package ex03.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
// @Data -- setter, getter, tostring
public class DeptDTO {
	private int deptno;
	private String dname;
	private String loc;

//	보일러플레이트 코드(Boilerplate Code): 개발하는데 반복적으로 사용하고 필수적인 코드
//	public int getDeptno() {
//		return deptno;
//	}
//	public void setDeptno(int deptno) {
//		this.deptno = deptno;
//	}
//	public String getDname() {
//		return dname;
//	}
//	public void setDname(String dname) {
//		this.dname = dname;
//	}
//	public String getLoc() {
//		return loc;
//	}
//	public void setLoc(String loc) {
//		this.loc = loc;
//	}
//	
//	@Override
//	public String toString() {
//		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
//	}

}
