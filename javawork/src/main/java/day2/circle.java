package day2;

public class circle {
	//필드
		int radius;
		double pie = Math.PI;
		double arearesult;
		
		//생성자
		public circle() {}
		public circle(int radius) {
			this.radius = radius;
		}
		
		//메서드
		public void area() {
			arearesult = radius * pie;
		}
}
