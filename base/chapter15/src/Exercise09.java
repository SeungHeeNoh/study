import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Exercise09 extends Frame{
	String filename;
	TextArea content;
	MenuBar mb;
	Menu mFile;
	MenuItem miNew, miOpen, miSaveAs, miExit;

	Exercise09(String title) {
		super(title);
		content = new TextArea();
		add(content);

		mb = new MenuBar();
		mFile = new Menu("File");

		miNew = new MenuItem("New");
		miOpen = new MenuItem("Open");
		miSaveAs = new MenuItem("Save As...");
		miExit = new MenuItem("Exit");

		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSaveAs);
		mFile.addSeparator();
		mFile.add(miExit);

		mb.add(mFile);
		setMenuBar(mb);

		MyHandler handler = new MyHandler();
		miNew.addActionListener(handler);
		miOpen.addActionListener(handler);
		miSaveAs.addActionListener(handler);
		miExit.addActionListener(handler);

		setSize(300, 200);
		setVisible(true);
	}

	void fileOpen(String fileName) {
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))) {
			StringWriter sw = new StringWriter();
			String line;

			while((line = br.readLine()) != null) {
				sw.write(line);
				sw.write("\n");
			}
			content.setText(sw.toString());
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	void saveAs(String fileName) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName)))) {
			bw.write(content.getText());
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String args[]) {
		Exercise09 mainWin = new Exercise09("Text Editor");
	}

	class MyHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();

			if(command.equals("New")) {
				content.setText("");
			}else if(command.equals("open")) {
				FileDialog fileOpen = new FileDialog(Exercise09.this, "open file");
				fileOpen.setVisible(true);
				filename = fileOpen.getDirectory() + fileOpen.getFile();
				System.out.println(filename);
				fileOpen(filename);
			}else if(command.equals("Save AS...")) {
				FileDialog fileSave = new FileDialog(Exercise09.this, "save file", FileDialog.SAVE);
				System.out.println(filename);
				saveAs(filename);
			}else if(command.equals("EXit")) {
				System.exit(0);
			}
		}
	}
}
