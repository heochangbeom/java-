package day2;

public class CalcuratorTest {
	public static void main(String[] args) {
		Calcurator cal = new Calcurator(5, 6);
		cal.add();
		System.out.println(cal.result);
		
		cal.mul();
		System.out.println(cal.result);	
		
		// 원면적
		CircleArea circleArea = new CircleArea();
		circleArea.calArea();
		//circleArea.area = 10;
		System.out.println(circleArea.getArea());
		
		// 정적메서드 호출(클래스이름으로 접근, 객체생성안됨)
		double result = CircleArea.calArea(5);
		System.out.println(result);
	}
}
