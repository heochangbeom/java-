package day2;

//1. 클래스 설계(선언)
public class Student {
	
	static String schoolName = "예담";
	
	int no;
	String name;
	String addr;
	
	//기본생성자 (인매개변수가 없는)
	public Student() {}
	
	
	//생성자 : 객체가 생성될 때 필드를 초기화함. 리턴타입이 없음. void도 안 적음. 클래스명고 동일
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	
	public Student(int no, String name, String addr) {
		super();
		this.no = no;
		this.name = name;
		this.addr = addr;
	}
	
	
	//생성자 오버로딩 : 같은 이름의 생성자가 여러개 선언(매개변수 타입, 갯수 달라야함)

	void addLecture() {
		System.out.println("수강신청완료");
	}
	
	
}
