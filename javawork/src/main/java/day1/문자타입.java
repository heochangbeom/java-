package day1;

public class 문자타입 {
	public static void main(String[] args) {
		int c1 = 'a';				//숫자타입에 문자를 담으면 코드값이 담김. char는 또 그거를 문자로 다시 변환해줌.
		System.out.println(c1);
		System.out.println((int)c1);
		System.out.println(c1-32);			//형변환 == 캐스트연산식
		System.out.println((char)(c1-32));	//소문자 'a'
		
		
	}
}
