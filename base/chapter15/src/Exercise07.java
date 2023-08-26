import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise07 extends Frame {
	String nickname = "";
	TextArea ta = new TextArea();
	Panel p = new Panel();
	TextField tf = new TextField(30);
	Button bSave = new Button("save");

	Exercise07(String nickname) {
		super("Chatting");
		this.nickname = nickname;

		setBounds(200, 100, 300, 200);

		p.setLayout(new FlowLayout());
		p.add(tf);
		p.add(bSave);

		add(ta, "Center");
		add(p, "South");

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		bSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				FileDialog fileSave = new FileDialog(Exercise07.this, "save file", FileDialog.SAVE);
				fileSave.setVisible(true);
				String fileName = fileSave.getDirectory() + fileSave.getFile();
				saveAs(fileName);
			}
		});

		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);

		ta.setText("#" + nickname + ". Have a happy chating time");
		ta.setEditable(false);

		setResizable(false);
		setVisible(true);
		tf.requestFocus();
	}

	void saveAs(String fileName) {
		File file = new File(fileName);
		BufferedWriter bw = null;
		try {
			if(!file.exists()) file.createNewFile();
			bw = new BufferedWriter(new FileWriter(file));

			bw.write(ta.getText());
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(bw != null) bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("USAGE : java Exercise07 NICKNAME");
			System.exit(0);
		}

		new Exercise07(args[0]);
	}

	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			if("".equals(msg)) return;

			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");
		}

		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	}
}
