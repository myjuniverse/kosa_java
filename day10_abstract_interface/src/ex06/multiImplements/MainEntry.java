package ex06.multiImplements;

import ex03.Abstract.Shape;
import ex05.Interface.IDraw;

public class MainEntry {
	public static void main(String[] args) {
		
		// 1. 자기자신
		MultiClass mc = new MultiClass();
		mc.display();
		mc.draw();
		
		// 2. 부모로 객체 생성
		Shape s = new MultiClass();
		s.calc(0);
		
		Test t = new MultiClass();
		t.testView();
		
		
	}
}
