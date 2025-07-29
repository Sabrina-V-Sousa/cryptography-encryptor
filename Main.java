import cryptography_classes.*;
import gui_classes.*;
// javac -d . cryptography_classes/*.java gui_classes/*.java Main.java
import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		Caesar test1 = new Caesar("Hello");
		Caesar test2 = new Caesar("Hello", 3);
		Caesar test3 = new Caesar("Hello my name is Sabrina! ZZZzzz, Honk, Mimimimimi...", 8);
		System.out.println(test1.getMessage() + "\nbecomes\n" + test1.encrypt());
		System.out.println(test2.getMessage() + "\nbecomes\n" + test2.encrypt());
		System.out.println(test3.getMessage() + "\nbecomes\n" + test3.encrypt());
		test3.setMessage(test3.encrypt());
		System.out.println(test3.getMessage() + "\nbecomes\n" + test3.decrypt());
		System.out.println(test3.getKey());

		//GUI using Java Swing
		JFrame frame = new JFrame("Cryptographic Encoder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024,512);

		JMenuBar menu = new JMenuBar();
		JMenu m1 = new JMenu("Select Crytography Type");
		menu.add(m1);
		JMenuItem m1_1 = new JMenuItem("Caesar");
		m1.add(m1_1);
		frame.setJMenuBar(menu);

		JPanel pane = new BackgroundImagePanel("assets/blue-matrix.jpg");
		frame.setContentPane(pane);

		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.NONE;

		JLabel header_label = new JLabel("Cryptographic Encoder", SwingConstants.CENTER);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridwidth = 8;
		c.gridy = 0;
		c.gridheight = 1;
		pane.add(header_label, c);
		c.fill = GridBagConstraints.NONE;

		JLabel label_in = new JLabel("     Enter Message");
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridwidth = 8;
		c.gridy = 1;
		c.gridheight = 1;
		pane.add(label_in, c);
		JTextArea ta_in = new JTextArea();
		JScrollPane scroll_in = new JScrollPane(ta_in);
		scroll_in.setPreferredSize(new Dimension(400, 100));
		c.gridx = 1;
		c.gridwidth = 8;
		c.gridy = 2;
		c.gridheight = 5;
		pane.add(scroll_in, c);
		JButton b_encrypt = new JButton("Encrypt");
		c.gridx = 1;
		c.gridwidth = 4;
		c.gridy = 7;
		c.gridheight = 1;
		pane.add(b_encrypt, c);
        JButton b_decrypt = new JButton("Decrypt");
		c.gridx = 5;
		c.gridwidth = 4;
		c.gridy = 7;
		c.gridheight = 1;
		pane.add(b_decrypt, c);
		c.fill = GridBagConstraints.NONE;

		JLabel label_out = new JLabel("     Output");
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridwidth = 8;
		c.gridy = 8;
		c.gridheight = 1;
		pane.add(label_out, c);
		JTextArea ta_out = new JTextArea();
		JScrollPane scroll_out = new JScrollPane(ta_out);
		scroll_out.setPreferredSize(new Dimension(400, 100));
		c.gridx = 1;
		c.gridwidth = 8;
		c.gridy = 9;
		c.gridheight = 5;
		pane.add(scroll_out, c);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 15;
		c.weighty = 1;
		pane.add(Box.createHorizontalStrut(10), c);
		c.gridx = 9;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 15;
		c.weighty = 1;
		pane.add(Box.createHorizontalStrut(10), c);
		c.gridx = 1;
		c.gridy = 14;
		c.gridwidth = 10;
		c.gridheight = 1;
		c.weighty = 1;
		pane.add(Box.createVerticalStrut(10), c);
		c.fill = GridBagConstraints.NONE;

		frame.setVisible(true);
    }
}