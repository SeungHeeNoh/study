import java.io.*;

public class Exercise05 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("USAGE: java Exercise05 TAGET_FILE RESULT_FILE");
			System.exit(0);
		}

		try(BufferedReader input = new BufferedReader(new FileReader(new File(args[0])));
			HtmlTagFilterWriter output = new HtmlTagFilterWriter(new FileWriter(new File(args[1])))) {
			int ch = 0;

			while((ch = input.read()) != -1) {
				output.write(ch);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

class HtmlTagFilterWriter extends FilterWriter {
	StringWriter tmp = new StringWriter();
	boolean inTag = false;

	HtmlTagFilterWriter(Writer out) {
		super(out);
	}

	public void write(int c) throws IOException {
		if(c == 60) {
			if(inTag) {
				out.write(tmp.toString());
			}
			inTag = true;
			
		}else if(c == 62) {
			inTag = false;
			tmp = new StringWriter();
			return;
		}

		if(!inTag) {
			out.write(c);
		}else {
			tmp.write(c);
		}
	}

	public void close() throws IOException {
		out.write(tmp.toString());
		super.close();
	}
}