package day1;

//근무시간 (9~18) 맞으면 Y / N
public class 조건문 {
	public static void main(String[] args) {
		
		int workTime = 10;
		int sTime = 10;
		int eTime = 17;
		//총근무시간이 8시간 이상이면 초과근무출력
			System.out.println(eTime - sTime - 1);
		
		if ( 8 > (eTime - sTime - 1)  ) {
			System.out.println("정상근무");
		} else{
			System.out.println("초과근무");
		}
		
		
		
//		if ( 9 <= workTime && workTime <= 18) {
//			System.out.println(workTime);
//		} else{
//			System.out.println(workTime);
//		}
		
		
		
	} //main
} // class
