package day2;

public class MeThodTest {
	
	public static void main(String[] args) {
		printHead(); // 매개변수 X 리턴 X
		printString("menu");
		printString("header");
		
		sum(5, 4); //매개변수가 있는 메서트   리턴 x
		int num = mul(5,4); //매개변수 O 리턴 O
		
		System.out.println(totals(2, 3, 4, 10));
		System.out.println(totals(2, 3));
		System.out.println(totals(2,3,1,4,5,3,2,7));
		
	}
	
	static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		return;
	}
	
	static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	
	static int totals(int ... score) {
		int result = 1;
		for( int num : score) {
			result *= num;
		}
		return result;
	}
 	
	//중복되는 코드 => 메서드
	static void printHead() {
		System.out.println("=============");
		System.out.println("===hearder===");
		System.out.println("=============");
	}
	
	static void pirntFooter() {
		System.out.println("============");
		System.out.println("===footer===");
		System.out.println("============");
	}
	
	static void printString(String str) {
		System.out.println("============");
		System.out.println("==="+ str +"===");
		System.out.println("============");
	}
}
