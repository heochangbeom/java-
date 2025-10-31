package day3.emp;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Employee> list = Arrays.asList(
				new Employee(100, "고길동", 2000),
				new Employee(101, "강김찬", 3000),
				new Employee(102, "김유신", 4000)
		);
	
	EmployeeList empList = new EmployeeList(list);
	
	
	//전체출력
//	empList.selectAll();
	System.out.println(empList.findById(101));
	System.out.println(empList.findByName("김유신"));
	System.out.println("===============이름=================");
	System.out.println(empList.findOrderByName());
	System.out.println("==================급여==============");
	System.out.println(empList.findOrderBySalary());
}}
