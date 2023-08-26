import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex08 {
	public static void main(String[] args) {
		ZoneId souelId = ZoneId.of("Asia/Seoul");
		ZonedDateTime souelTime = ZonedDateTime.of(2016, 0, 28, 23, 1, 0, 136, souelId);
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.of(2016, 0, 28, 23, 1, 0, 136, nyId);

		System.out.println(souelTime);
		System.out.println(nyTime);
	}
}
