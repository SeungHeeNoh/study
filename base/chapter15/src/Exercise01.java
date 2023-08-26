import java.io.*;
import static java.lang.Integer.parseInt;

public class Exercise01 {
	public static void main(String args[]) {
		if(args.length < 2) {
			System.out.println("USAGE: java Exercise01 10 FILENAME");
			System.exit(0);
		}

		int length = parseInt(args[0]);
		File file = new File(args[1]);

		if(file.isDirectory() || !file.exists()) {
			String fileName = file.getName();
			System.out.println(fileName.substring(0, fileName.lastIndexOf(".")) + " is Directory, or not found.");
			System.exit(0);
		}

		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			int i=1;
			String line;
			while((line = br.readLine()) != null && i <=length) {
				System.out.println(i++ + ":" + line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
