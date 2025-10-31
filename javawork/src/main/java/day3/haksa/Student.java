package day3.haksa;

public class Student extends Member {

	private int grade;
	
	//생성자
	public Student() {}
	public Student(int no, String name, int grade) {
		this.grade = grade;
		this.no = no;
		this.name = name;
	}
	
	//setter/getter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	//메서드
	@Override
	public String toString() {
		return "Student [no=" + no + 
						", name=" + name 
						+ ", grage=" + grade+ "]";
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.update();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
