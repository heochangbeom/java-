package day2;

import java.time.LocalDate;
import java.util.Calendar;

public class dateUtil {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(calendar.DAY_OF_YEAR));
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate birth = LocalDate.of(2005, 05, 25);
		System.out.println(date);
		
		String regDate = "2025-10-10";
		String[] result = regDate.split("-");
		System.out.println(result[0]);
		
		String syear = StringUtil.getSplitYear("2005-05-25");
		System.out.println(syear);
	}
}
