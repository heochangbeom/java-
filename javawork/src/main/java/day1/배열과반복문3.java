package day1;

import java.util.ArrayList;

public class 배열과반복문3 {
	public static void main(String[] args) {
		//성적 5개
		ArrayList<Integer> score = new ArrayList();
		score.add(5);
		score.add(4);
		score.add(3);
		score.add(2);
		score.add(1);
		
		//통과된 건수를 저장할 변수를 선언하고 0으로 초기화
		
		//성적 출력
		for(int i= 0; i < score.size(); i++) {
			System.out.print(score.get(i));
			
			//통과여부출력 (3점이상이면)
			if ( 3 < score.get(i) ) {
				System.out.println(" 통과");
				cnt+=1;
			} else {
				System.out.println(" 불합격");
			}
		}
		
		
	}//main
}//class
