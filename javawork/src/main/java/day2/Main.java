package day2;

/*
테스트
*/
public class Main {
	public static void main(String[] args) {
		//2. 객체 생성
			    //참조변수임	 //인스턴스(힙(메모리)에 저장공간이 할당)
		Student student = new Student();
		student.no = 2006001;
		student.name = "고길동";
		student.addr = "대구";
		
		Student s3 = new Student(20001, "둘리");
		//3. 사용
		student.addLecture();
		
		Student s4 = new Student(2001, "또치", "서울");
		
		
		ProFessor prof = new ProFessor();
		
		
		//얕은복사. 주소만 복사 변수 2개가 하나의 인스턴스를 참조하고 있는거임.
		Student student2 = student;
		student2.name = "홍길동";
		
		System.out.println(student.name);
		System.out.println(student == student2);
	}
}
