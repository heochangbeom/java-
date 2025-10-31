package day3.emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 람다식 {
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(100, "고길동", 2000),
				new Employee(101, "강김찬", 3000),
				new Employee(102, "김유신", 4000)
		);
		// 1. Comparator 구현객체
//		list.sort(new MySort());
//		System.out.println(list);
		
		//2. 익명클래스 
//		list.sort(new Comparator<Employee>(){
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int)(o1.getSalary() - o2.getSalary());
//			}  });
		
		//3. 람다표현식{JS 화살표함수와 같음}
//		list.sort((Employee o1, Employee o2) -> 
//								o1.getFirstName().compareTo(o2.getFirstName()) );
		
		
		//4. Comparator 스태틱 메서드
//		list.sort( Comparator.comparing( (Employee e) -> e.getSalary() ));
		
		//5. 스태틱 메서드 -> 메서드 참조(더블콜론 - 람다표현식 축약문법)
		list.sort( Comparator.comparing( Employee::getSalary )  );
		
		list.forEach(  e -> System.out.println(e)  );
		System.out.println("=================");
		list.forEach(  System.out::println  );
		
		
	}
}

class MySort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeId() - o2.getEmployeeId();
	}
	
}