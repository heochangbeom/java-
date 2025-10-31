package day2;

//원을 면적을 계산하는 클래스
public class CircleArea {
	//필드
	private int radius;				// read, write
	private double area; 	//캡슐화 read
	
	//생성자
	public CircleArea() {}
	public CircleArea(int radius) {
		this.radius = radius;
	}
	
	public static double calArea(int r) {
		return r * r * Math.PI;
	}
	
	//메서드 오버로딩(중복확인 : 같은 이름 가능. 매개변수 타입,수 다름)
	public void calArea(){
		area = radius * radius * Math.PI;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	
	//setter//getter
}

