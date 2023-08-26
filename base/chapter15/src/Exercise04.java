import java.io.*;

public class Exercise04 {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("USAGE: java FileMergeTest MERGE_FILENAME FILENAME1 FILENAME2 ...");
			System.exit(0);
		}

		try {
			File resultFile = new File(args[0]);
			resultFile.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(resultFile));

			for(int i=1; i<args.length; i++) {
				BufferedReader br = new BufferedReader(new FileReader(new File(args[i])));
				String line;

				while((line = br.readLine()) != null) {
					bw.write(line);
				}
				bw.newLine();

				if(i == args.length-1) br.close();
			}
			bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
