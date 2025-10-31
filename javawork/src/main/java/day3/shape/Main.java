package day3.shape;

import java.util.ArrayList;

/*다형성
	-	1. 상속관계에서 부모타입의 변수가 자식객체를 참조가능
	-	2. 상속후에 메서드를 재정의(오버라이딩)가능함
	-	3. 오버라이딩한 메서드가 있으면 호출하고 없으면 부모의 메서드가 호출됨.
			3.1 실행코드는 같지만 참조하는 자식객체의 메서드가 실행되므로 결과는 다르게 나옴.
*/
public class Main {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();
		list.add(new Line());
		list.add(new Circle());
		list.add(new Tri());
		
		for( Shape s : list) {
			s.draw();
		}
		
		shapeDraw(new Line());
		shapeDraw(new Circle());
	}
	
	public static void shapeDraw(Shape c) {
		c.draw();
	}
}
