import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex06 {
	public static void main(String[] args) {
		LocalDate birthday = LocalDate.of(1994, 9, 4);
		LocalDate today = LocalDate.now();
		long days = birthday.until(today, ChronoUnit.DAYS);

		System.out.println("birth day = " + birthday);
		System.out.println("today     = " + today);
		System.out.println(days + " days");
	}
}
