import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			SimpleDateFormat result = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date inDate = null;

			while(true) {
				try {
					System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
					System.out.print(">> ");
					inDate = sdf.parse(br.readLine());
					break;
				}catch(Exception e) {

				}
			}

			System.out.println(result.format(inDate));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
