package day1;

import java.util.ArrayList;

public class 리스트 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		//추가
		list.add("사과");
		list.add("키위");
		list.add("딸기");
		System.out.println(list); //[사과, 키위, 딸기]
		
		//삽입
		list.add(0,"메론");
		System.out.println(list); //[메론, 사과, 키위, 딸기]
		
		//삭제
		list.remove(1);
		System.out.println(list); //[메론, 키위, 딸기]
		
		//변경
		list.set(0,  "망고");
		System.out.println(list); //[망고, 키위, 딸기]
		
		//조회
		System.out.println( "첫번째 과일은: " + list.get(0) ); //
		
		//전체조회 1.for
		String temp = null;
		for(int i=0; i< list.size(); i++) {
			temp = list.get(i);
			System.out.println(i+ " : " + temp);
		}
		//2. 확장 for
		System.out.println("확장for==============");
		for(String f : list ) {
			System.out.println( f );
		}
	}
}
