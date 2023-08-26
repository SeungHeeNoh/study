import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise08 extends Frame {
	Button first = new Button("<<");
	Button prev = new Button("<");
	Button next = new Button(">");
	Button last = new Button(">>");
	Panel buttons = new Panel();
	TextArea ta = new TextArea();
	ArrayList<String> wordList = new ArrayList<String>();

	final String WORD_FILE = "word_data.txt";
	final String CR_LF = System.getProperty("line.separator");

	int pos = 0;

	Exercise08(String title) {
		super(title);

		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		add("South", buttons);
		add("Center", ta);

		EventHandler handler = new EventHandler();
		addWindowListener(handler);
		first.addActionListener(handler);
		prev.addActionListener(handler);
		next.addActionListener(handler);
		last.addActionListener(handler);

		loadFile(WORD_FILE);

		setBackground(Color.BLACK);
		setSize(300, 200);
		setLocation(200, 200);
		setResizable(true);
		setVisible(true);

		showFirst();
	}

	void showFirst() {
		pos = 0;
		display(pos);
	}

	void showPrevious() {
		pos = (pos > 0) ? --pos : 0;
		display(pos);
	}

	void showNext() {
		int size = wordList.size();
		pos = (pos < size-1) ? ++pos : size-1;
		display(pos);
	}

	void showLast() {
		pos = wordList.size()-1;
		display(pos);
	}

	void display(int pos) {
		StringTokenizer st = new StringTokenizer(wordList.get(pos).toString(), "|");
		StringBuffer sb = new StringBuffer();

		while(st.hasMoreTokens()) {
			sb.append(st.nextToken()).append(CR_LF);
		}
		ta.setText(sb.toString());
	}

	void loadFile(String fileName) {
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
			String line = "";

			while((line = br.readLine()) != null) {
				wordList.add(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	class EventHandler extends WindowAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			Button b = (Button)ae.getSource();

			if(b == first) {
				showFirst();
			}else if(b == prev) {
				showPrevious();
			}else if(b == next) {
				showNext();
			}else if(b == last) {
				showLast();
			}
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String args[]) {
		Exercise08 mainWin = new Exercise08("Word Study");
	}
}
