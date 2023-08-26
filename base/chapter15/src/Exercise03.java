import java.io.*;

public class Exercise03 {
	static int totalFiles = 0;
	static int totalDirs = 0;
	static int totalSize = 0;
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java Exercise03 DIRECTORY");
			System.exit(0);
		}

		File dir = new File(args[0]);

		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("Invailed Directory");
			System.exit(0);
		}

		countFiles(dir);

		System.out.println("total file : " + totalFiles + " file(s)");
		System.out.println("total directory : " + totalDirs + " directory(s)");
		System.out.println("size : " + totalSize + "bytes");
	}

	public static void countFiles(File file) {
		File[] files = file.listFiles();

		for(int i=0; i<files.length; i++) {
			File temp = files[i];

			if(temp.isDirectory()) {
				totalDirs++;
				countFiles(temp);
			}else {
				totalFiles++;
				totalSize += temp.length();
			}
		}
	}
}