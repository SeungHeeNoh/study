import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		
		while(c.get(Calendar.YEAR) == 2010) {
			if(c.get(Calendar.DAY_OF_WEEK) == 1) {
				c.add(Calendar.DATE, 7);
			}else {
				c.add(Calendar.DATE, 8+(7-c.get(Calendar.DAY_OF_WEEK)));
			}

			System.out.println(sdf.format(c.getTime()));

			c.add(Calendar.MONTH, 1);
			c.set(Calendar.DATE, 1);
		}
	}
}
