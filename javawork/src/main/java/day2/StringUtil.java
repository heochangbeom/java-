package day2;
/**
 * @author kym
 * @since 1.4
 */
public class StringUtil {

	/**
	 * 주민번호로 출생년도 추출
	 * @param id 주민번호
	 * @return 년도 4자리
	 */
	public static String getYear(String id) {
		//id가 없으면 빈값 넘겨줌.
		if (id == null) {
			return "";
		}
		String result = id.substring(0, 4);
		return result;
	}
	
	//년, 월, 일을 join해서 리턴
	public static String getDate(String ... date) {
//		return date[0] +
			return String.join("-", date);
	}
	public static String getDate(String y, String m, String d) {
		//return y +"-" + m + "-" + "d";
		return String.join("-", y, m, d);
	}
	
	public static String getSplitYear(String allday) { // y-m-d 형식의 날짜문자열을 받아서 '-' 나누어서 연도만 리턴
		String[] splitday = allday.split("-");
		return splitday[0];
	}
}
