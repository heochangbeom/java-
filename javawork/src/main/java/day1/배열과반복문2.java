package day1;

public class 배열과반복문2 {
	public static void main(String[] args) {
		//성적 5개
		int[] score = {5,4,3,5,2};
		int cnt = 0;
		
		//통과된 건수를 저장할 변수를 선언하고 0으로 초기화
		
		//성적 출력
		for( int number : score ) {
			System.out.print(number);

			//통과여부출력 (3점이상이면)
			if ( 3 < number ) {
				System.out.println(" 통과");
				cnt+=1;
			} else {
				System.out.println(" 불합격");
			}
			
			System.out.print(cnt);
		}
		
		
	}//main
}//class
