package quiz;

import java.util.Date;

public class Video {
//	문제] Video class 
//	no  비디오번호
//	title 비디오제목
//	category  장르
//	lend   대여여부
//	lendName  대여자(고객명)
//	lendDate   대여일자(오늘날짜 입력하심 되요)
//	
//	Video 추가 / 삭제 / Video 리스트 출력 / 수정 / 프로그램 종료  출력하는 프로그램 작성하기.
	
	int no;
	String title;
	String category;
	boolean lend;
	String lendName;
	Date lendDate;
	
	public Video() {}
	
	public Video(String title, String category) {
		this.no = no;
		this.title = title;
	}
	
	public Video(int no, String title, String category, boolean lend, String lendName, Date lendDate) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isLend() {
		return lend;
	}
	public void setLend(boolean lend) {
		this.lend = lend;
	}
	public String getLendName() {
		return lendName;
	}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public Date getLendDate() {
		return lendDate;
	}
	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	@Override
	public String toString() {
		return "[" + "제목: " + title + " 카테고리: " + category + " 대여여부: " + lend + " 대여자: "
				+ lendName + " 대여일: " + lendDate + "]";
	}
	
	
	
}