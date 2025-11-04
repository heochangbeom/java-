package com.factory;

// main 매개변수 = 명령행 인수		
public class Main {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		//상속과 다형성 - 부모타입의 참조변수가 자식객체를 참조할 수 있다.
		TV tv =(TV)factory.getBean(args[0]);
		
		tv.powerOn();
		tv.volumeUp();
	}
}
