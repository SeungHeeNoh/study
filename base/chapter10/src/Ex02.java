import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	static int paycheckCount(Calendar from, Calendar to) {
		int monDiff = 0;

		if(from == null || to == null) {
			monDiff = 0;
		}else {
			if(from.equals(to)) {
				if (from.get(Calendar.DAY_OF_MONTH) == 21) {
					monDiff = 1;
				}
			}else if(to.before(from)) {
				monDiff = 0;
			}else {
				monDiff = 12 * (to.get(Calendar.YEAR) - from.get(Calendar.YEAR))  + to.get(Calendar.MONTH) - from.get(Calendar.MONTH);
				if (from.get(Calendar.DAY_OF_MONTH) <= 21 && to.get(Calendar.DAY_OF_MONTH) >=21) monDiff++;
				else if(from.get(Calendar.DAY_OF_MONTH) > 21 && to.get(Calendar.DAY_OF_MONTH) < 21) monDiff--;
			}
		}
		return monDiff;
	}

	static void printResult(Calendar from, Calendar to) {
		Date fromDate = from.getTime();
		Date toDate = to.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
		System.out.println(paycheckCount(from, to));
	}

	public static void main(String args[]) {
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal = Calendar.getInstance();

		fromCal.set(2010, 0, 1);
		toCal.set(2010, 0, 1);
		printResult(fromCal, toCal);

		fromCal.set(2010, 0, 21);
		toCal.set(2010, 0, 21);
		printResult(fromCal, toCal);

		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 1);
		printResult(fromCal, toCal);

		fromCal.set(2010, 0, 1);
		toCal.set(2010, 2, 23);
		printResult(fromCal, toCal);

		fromCal.set(2010, 0, 23);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);

		fromCal.set(2011, 0, 22);
		toCal.set(2010, 2, 21);
		printResult(fromCal, toCal);
	}

}
