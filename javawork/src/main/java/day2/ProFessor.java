package day2;

public class ProFessor {
	
	int no;
	String name;
	String addr;
	int roomNo;
	
	//기본생성자(매개변수가 없는)
	//생성자가 하나도 선언된게 없으면 컴파일러가 자동으로 추가해줌.
	
	//생성자를 만들면 기본생성자는 없음.
	public ProFessor() {
		this(0, "무명"); // this() : 다른 생성자를 호출
	}
	public ProFessor(int no, String _name) {
		this.no = no;	//this. : 자신 객체
		name = _name;
		//이름이 다르면 this.를 적어야됨
	}
	
}
