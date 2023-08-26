import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Ex05 {
	public static int getDayDiff(String start, String end) {
		int diff = 0;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

		try {
			Calendar startDate = Calendar.getInstance();
			Calendar endDate = Calendar.getInstance();

			startDate.setTime(sdf.parse(start));
			endDate.setTime(sdf.parse(end));

			LocalDate sDate = LocalDate.of(startDate.get(Calendar.YEAR), startDate.get(Calendar.MONTH+1), startDate.get(Calendar.DATE));
			LocalDate eDate = LocalDate.of(endDate.get(Calendar.YEAR), endDate.get(Calendar.MONTH+1), endDate.get(Calendar.DATE));

			diff = (int)(eDate.until(sDate, ChronoUnit.DAYS));
		}catch(Exception e) {
			return diff;
		}

		return diff;
	}
	
	public static void main(String[] args) {
		System.out.println(getDayDiff("20010103", "20010101"));
		System.out.println(getDayDiff("20010103", "20010103"));
		System.out.println(getDayDiff("20010103", "200103"));
	}


}
