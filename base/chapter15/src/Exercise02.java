import java.io.*;

public class Exercise02 {
	public static void main(String args[]) {
		if(args.length != 1) {
			System.out.println("USAGE : java Exercise02 CLASS_FILE_NAME");
			System.exit(0);
		}

		try(BufferedInputStream bi = new BufferedInputStream(new FileInputStream(new File(args[0])));
			PrintStream output = new PrintStream(System.out)) {
			int c;
			int count = 0;

			while((c = bi.read()) != -1) {
				output.printf("%02X ", c);
				if(++count == 16) {
					output.println();
					count = 0;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
