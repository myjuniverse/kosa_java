package model.service;

import java.sql.Connection;
import java.util.ArrayList;

import common.JDBCTemplate;
import model.dao.ProductDao;
import model.vo.Product;

public class ProductService {

	public ArrayList<Product> pList() {
		Connection conn = JDBCTemplate.getConnection();
		ArrayList<Product> pList = new ProductDao().productList(conn);
		JDBCTemplate.close(conn);
		
		return pList;
	}

	public int insertProduct(Product p) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new ProductDao().insertProduct(conn, p);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		
		return result;
	}

	public int updateProduct(Product p) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new ProductDao().updateProduct(conn, p);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int deleteProduct(String productCode) {
		Connection conn = JDBCTemplate.getConnection();
		int result = new ProductDao().deleteProduct(conn, productCode);
		
		if (result > 0) {
			JDBCTemplate.commit(conn);
		} else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}

}
