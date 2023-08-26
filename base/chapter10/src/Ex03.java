import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex03 {
	public static void main(String[] args) {
		DecimalFormat round = new DecimalFormat("#");
		DecimalFormat comma = new DecimalFormat("#,####");
		DecimalFormat dataFormat = new DecimalFormat("#,###.##");
		String data = "123,456,789.5";
		try {
			Number num = dataFormat.parse(data);
			double doubleData = num.doubleValue();

			System.out.println("data : " + doubleData);
			System.out.println("반올림 : " + round.format(doubleData));
			System.out.println("만단위 : " + comma.format(doubleData));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
