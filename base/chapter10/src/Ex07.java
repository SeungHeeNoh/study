import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex07 {
	public static void main(String[] args) {
		Calendar day = Calendar.getInstance();
		day.set(2016, 11, 1);
		day.set(Calendar.WEEK_OF_MONTH, 5);
		day.set(Calendar.DAY_OF_WEEK, 3);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E 요일");
		System.out.println(sdf.format(day.getTime()));
	}
}
