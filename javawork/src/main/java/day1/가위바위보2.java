package day1;

import java.util.Scanner;

public class 가위바위보2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user;
		int computer;
		int winCnt = 0;
		int drawCnt = 0;
		int loseCnt = 0;
		
		//반복문
		while(true) {
			//메뉴출력
			System.out.println("1가위 2바위 3보 0종료");
			
			//사용자 값을 입력받고
			user = scanner.nextInt();
			
			//0이면 종료
			if(user == 0) {
				System.out.println("승리: " + winCnt + ", 무승부:" + drawCnt + ", 패배:" + loseCnt);
				break; //아예 반복문 밑으로 나가버림
				
			}
			
			//1~3이 아니면 다시 입력
			if(user>3) continue; //올라가서 다시실행
			
			computer = (int)(Math.random()*3) + 1; 
			
			if ( user%3 == computer%3 ) {
				System.out.println("나:" + user + ", 컴퓨터" + computer + ", 결과:무승부");
				drawCnt++;
				continue;
			}
			
			if ( (user+1)%3 == computer%3) {
				System.out.println("나:" + user + ", 컴퓨터" + computer + ", 결과:패배");
				loseCnt++;
				continue;
			}
			
			if ( (user+2)%3 == computer%3) {
				System.out.println("나:" + user + ", 컴퓨터" + computer + ", 결과:승리");
				winCnt++;
				continue;
				
			}
			
		
	}
} //main
} //class