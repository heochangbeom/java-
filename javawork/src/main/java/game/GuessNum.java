package game;

import java.util.Scanner;

public class GuessNum {
	public void start() {
	Scanner scanner = new Scanner(System.in);
		
		Outter: while(true) {
			int user;
			int computer;
			int winCnt = 0;
			int drawCnt = 0;
			int loseCnt = 0;
			int restart;
			computer = (int)(Math.random()*100) + 1;
			//반복문
			while(true) {
				//메뉴출력
				System.out.println("숫자를 입력해 주십시오");
				
				//사용자 값을 입력받고
				user = scanner.nextInt();
				
				if ( user < computer ) {
					System.out.println("up!");
					drawCnt++;
					continue;
				}
				
				if ( user > computer) {
					System.out.println("down!");
					loseCnt++;
					continue;
				}
				
				if ( user == computer) {
					System.out.println("정답입니다!\n다시시작하시겠습니까? 예:1, 아니요:2");
					restart = scanner.nextInt();
					if(restart == 1) break;
					if(restart == 2) break Outter;
//					if(restart.equals("Y")) break;
//					if(restart.equals("N")) break Outter;
				}
				continue;
			}
		}
		System.out.println("게임종료");
	}
}// class
