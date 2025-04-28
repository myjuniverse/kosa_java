package ex02.jdbc;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dbConn.util.ConnectionHelper;

public class JDBCProjectEx3 extends JFrame implements ActionListener{
	// component 객체 선언
	JPanel panWest, panSouth;  // 왼쪽텍스트필드, 아래쪽 버튼
	JPanel p1,p2,p3,p4,p5; 
	JTextField txtNo, txtName, txtEmail, txtPhone;
	JButton  btnTotal, btnAdd, btnDel, btnSearch, btnCancel;
	
	JTable table; // 검색과 전체 보기를 위한 테이블 객체 생성
	
	// 상태변화를 위한 변수 선언
	private static final int NONE = 0;
	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int TOTAL = 4;
	int cmd = NONE;
	
	MyModel model;
	
	public JDBCProjectEx3(){ // 생성자함수 초기화 담당
		// component 등록
		panWest = new JPanel(new GridLayout(5, 0));
		p1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(new JLabel("번    호"));
		p1.add(txtNo = new JTextField(12));
		panWest.add(p1);
		
		p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(new JLabel("이    름"));
		p2.add(txtName = new JTextField(12));
		panWest.add(p2);
		
		p3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p3.add(new JLabel("이  메  일"));
		p3.add(txtEmail = new JTextField(12));
		panWest.add(p3);
		
		p4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p4.add(new JLabel("전화번호"));
		p4.add(txtPhone = new JTextField(12));
		panWest.add(p4);
		
		p5 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p5.add(new JLabel(""));
		panWest.add(p5);
		
		add(panWest, "West");
		
		// button 화면 아래 등록
		panSouth = new JPanel();
		panSouth.add(btnTotal= new JButton("전체보기")); 
		panSouth.add(btnAdd= new JButton("추     가"));
		panSouth.add(btnDel= new JButton("삭     제"));
		panSouth.add(btnSearch= new JButton("검     색"));
		panSouth.add(btnCancel= new JButton("취     소"));
		add(panSouth, "South");
		
		// event 처리
		btnTotal.addActionListener(this);
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnSearch.addActionListener(this);
		btnCancel.addActionListener(this);
		
		// 테이블 객체 생성
		add(new JScrollPane(table = new JTable()), "Center");
		// close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//메인 창 출력
		setBounds(100, 100, 700, 300); // setSize(W,H);   pack(); 
		setVisible(true);
		
		dbconnect(); // db연결
		total();
		
	} // constuctor end
	
	///--------------* db setting *--------------///
	
	Connection conn;
	Statement stmt;
	PreparedStatement psInsert, psDelete;	
	PreparedStatement psTotal, psTotalScroll;
	PreparedStatement psSearch, psSearchScroll;
	
	private String sqlInsert = "INSERT INTO CUSTOMERS VALUES(?, ?, ?, ?)";
	private String sqlDelete = "DELETE FROM CUSTOMERS WHERE CODE = ?";
	private String sqlSelect = "SELECT * FROM CUSTOMERS";
//	private String sqlSearch = "SELECT * FROM CUSTOMERS WHERE NAME = ?";
	private String sqlSearch = "SELECT * FROM CUSTOMERS WHERE NAME LIKE ?";
	
	public void dbconnect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			psInsert = conn.prepareStatement(sqlInsert);
			psDelete = conn.prepareStatement(sqlDelete);
			psTotal = conn.prepareStatement(sqlSelect);
			psSearch = conn.prepareStatement(sqlSearch);
			
			psTotalScroll = conn.prepareStatement(sqlSelect,
										ResultSet.TYPE_SCROLL_SENSITIVE, // 커서 이동을 자유롭게, 업데이트 내용을 반영함
										ResultSet.CONCUR_UPDATABLE); //	resultset object 의 변경이 가능 <-> CONCUR_READONLY(읽기전용)
			psSearchScroll = conn.prepareStatement(sqlSearch,
										ResultSet.TYPE_SCROLL_SENSITIVE,
										ResultSet.CONCUR_UPDATABLE);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // 버튼 이벤트 처리
		Object obj = e.getSource();
		if (obj == btnAdd){
			if( cmd != ADD ){
				setText(ADD); // user method
				return;
			} // if in
			setTitle(e.getActionCommand());
			add(); // 추가
			
		} else if (obj == btnDel){
			if( cmd != DELETE ){
				setText(DELETE);  // user method
				return;
			} // if in
			setTitle(e.getActionCommand());
			del(); // 삭제
			
		} else if (obj == btnSearch){
			if( cmd != SEARCH ){
				setText(SEARCH);  // user method
				return;
			} // if in
			setTitle(e.getActionCommand());
			search(); // 검색
			
//		} else if (obj == btnUpdate){
//			if( cmd != UPDATE ){
//				setText(UPDATE);  //user method
//				return;
//			} //if in
//			setTitle(e.getActionCommand());
//			update(); // 수정
			
		} else if (obj == btnTotal){
			setTitle(e.getActionCommand());
			total(); // 전체보기
		}
		setText(NONE);
		init(); // 초기화 메소드, user method
	} // actionPerformed end

	///------------* Button Event 처리 *------------///
	
	public void add() { // insert
		try {
			String strNo = txtNo.getText();
			String strName = txtName.getText();
			String strEmail = txtEmail.getText();
			String strPhone = txtPhone.getText();
//			System.out.println(strNo + strName + strEmail + strPhone);
//			
//			if (strNo.length() < 1 || strName.length() < 1) {
//				JOptionPane.showMessageDialog(null, "번호와 이름은 필수 사항입니다.");
//				return;
//			}
			
			switch (JOptionPane.showConfirmDialog(null, "(" + strNo + ", " + strName + ", " + strEmail + ", " + strPhone + ")" ,
														" 추가하시겠습니까? ", JOptionPane.YES_NO_OPTION)) {
			case 0: // 확인
				break;
			case 1: // 아니오
				return;				
			} // switch end
			
			psInsert.setInt(1, Integer.parseInt(strNo));
			psInsert.setString(2, strName);
			psInsert.setString(3, strEmail);
			psInsert.setString(4, strPhone);
			
			psInsert.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "추가되었습니다.");
			
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void del() {	// delete
		String strNo = txtNo.getText();
		String strName = txtName.getText();
		String strEmail = txtEmail.getText();
		String strPhone = txtPhone.getText();
		
		if (strNo.length() < 1) {
			JOptionPane.showMessageDialog(null, "번호를 입력해주세요.");
			return;
		}
		
		try {
			switch (JOptionPane.showConfirmDialog(null, "(" + strNo + ", " + strName + ", " + strEmail + ", " + strPhone + ")" ,
														" 삭제하시겠습니까? ", JOptionPane.YES_NO_OPTION)) {
			case 0: // 확인
			break;
			case 1: // 아니오
			return;				
			} // switch end
			
			psDelete.setInt(1, Integer.parseInt(strNo));
			psDelete.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "삭제되었습니다.");
			
			init();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void search() { // select
		String strName = txtName.getText();
		
		if (strName.length() < 1) {
			JOptionPane.showMessageDialog(null, "이름은 필수 입니다. 입력해주세요.");
			return;
		}
		try {
			psSearchScroll.setString(1, "%" + strName + "%");
			ResultSet rsScroll = psSearchScroll.executeQuery();
			
			psSearch.setString(1, "%" + strName + "%");
			ResultSet rs = psSearch.executeQuery();
			
			if (model == null) {
				model = new MyModel();
			}
			model.getRowCount(rsScroll);
			model.setData(rs);
			
			table.setModel(new DefaultTableModel(model.data, model.columnName));
			table.updateUI(); // 화면 다시 그려줌
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() { // update
		
	}

	public void total() {
		try {
			ResultSet rs = psTotal.executeQuery();
			ResultSet rsScroll = psTotalScroll.executeQuery(); // 스크롤
			
			if (model == null) {
				// 객체 생성, 메모리 할당, 생성자함수 자동호출
				model = new MyModel();
			}
			model.getRowCount(rsScroll);
			model.setData(rs);
			
//			table.setModel(model);
			table.setModel(new DefaultTableModel(model.data, model.columnName));
			table.updateUI();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	///------------------------------------------///
	private void init() { // 초기화 메서드
		txtNo.setText("");			txtNo.setEditable(false);
		txtName.setText("");		txtName.setEditable(false);
		txtEmail.setText("");		txtEmail.setEditable(false);
		txtPhone.setText("");		txtPhone.setEditable(false);
	} // init() end

	private void setText(int command) {
		switch (command) {
			case ADD :
				txtNo.setEditable(true);
				txtName.setEditable(true);
				txtEmail.setEditable(true);
				txtPhone.setEditable(true);
				break;
			case DELETE :
				txtNo.setEditable(true);
				break;
			case SEARCH :
				txtName.setEditable(true);
				break;
		} // switch end
		
		setButton(command);  // user method
		
	} // setText() end

	private void setButton(int command) {
		// cancel button 제외하고 어떤 버튼이 눌리더라도 모든 버튼이 비활성화
		btnTotal.setEnabled(false);
		btnAdd.setEnabled(false);
		btnDel.setEnabled(false);
		btnSearch.setEnabled(false);
		
		switch (command) {
			case ADD :
				btnAdd.setEnabled(true);
				cmd = ADD;
				break;
			case DELETE :
				btnDel.setEnabled(true);
				cmd = DELETE;
				break;
			case SEARCH :
				btnSearch.setEnabled(true);
				cmd = SEARCH;
				break;
			case TOTAL :
				btnTotal.setEnabled(true);
				cmd = TOTAL;
				break;
			case NONE :
				btnTotal.setEnabled(true);
				btnAdd.setEnabled(true);
				btnDel.setEnabled(true);
				btnSearch.setEnabled(true);
				btnCancel.setEnabled(true);  //
				cmd = NONE;
				break;
		} // switch end	
	} // setButton end

	public static void main(String[] args) {
		new JDBCProjectEx3();
	} // main
}