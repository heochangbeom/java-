package day2;


// 두수의 덧셈과 뺄셈을 수행하는 계산기

public class Calcurator {
	//필드
	int n1;
	int n2;
	int result;
	
	//생성자
	public Calcurator() {}
	public Calcurator(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	//메서드
	public void add() {
		result = n1 + n2;
	}
	public void mul() {
		result = n1 * n2;
	}
}
