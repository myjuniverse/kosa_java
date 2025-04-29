package controller;

import java.util.ArrayList;

import model.service.ProductService;
import model.vo.Product;
import view.MainEntry;


public class ProductController {
	
	// 상품 조회
	public void productList() {
		ArrayList<Product> pList = new ProductService().pList();
		
		if (pList.isEmpty()) {
			new MainEntry().displayNoData("상품이 없습니다.");
		} else {
			new MainEntry().displaypList(pList);
		}
	}
	
	// 상품 추가
	public void insertProduct(Product p) {
		p = new Product();
		int result = new ProductService().insertProduct(p);
		
		if (result > 0) {
			new MainEntry().displaySuccess("\n상품이 추가되었습니다.");
		} else {
			new MainEntry().displayFail("\n상품 추가에 실패하였습니다.");
		}
	}
	
	// 상품 수정
	public void updateProduct(int productCode, String productName, int productPrice) {
		Product p = new Product();
		
		p.setProductCode(productCode);
		p.setProductName(productName);
		p.setProductPrice(productPrice);
		
		int result = new ProductService().updateProduct(p);
		
		if (result > 0) {
			new MainEntry().displaySuccess("\n상품이 수정되었습니다.");
		} else {
			new MainEntry().displayFail("\n상품 수정에 실패하였습니다.");
		}
	}
	
	// 상품 삭제
	public void deleteProduct(int productCode) {
		int result = new ProductService().deleteProduct(productCode);
		
		if (result > 0) {
			new MainEntry().displaySuccess("\n상품이 삭제되었습니다.");
		} else {
			new MainEntry().displayFail("\n상품 삭제에 실패하였습니다.");
		}
	}
	
}
