import cryptography_classes.*;
// javac -d . cryptography_classes/*.java Main.java
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

		JPanel pane = new JPanel();
		frame.setContentPane(pane);

		GridBagConstraints c = new GridBagConstraints();
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.HORIZONTAL;

		JLabel headerLabel = new JLabel("Cryptographic Encoder");
		c.gridx = 0;
		c.gridwidth = 3;
		c.gridy = 0;
		pane.add(headerLabel, c);



		// JMenuBar menu = new JMenuBar();
		// JMenu m1 = new JMenu("Select Crytography Type");
		// menu.add(m1);
		// JMenuItem m1_1 = new JMenuItem("Caesar");
		// m1.add(m1_1);

		// JPanel input_panel = new JPanel();
		// JLabel label = new JLabel("Enter Message");
		// String blank_string = "                                                                                                    ";
		// JTextField tf = new JTextField(blank_string);
		// JButton encrypt = new JButton("Encrypt");
        // JButton decrypt = new JButton("Decrypt");
		// input_panel.add(label);
		// input_panel.add(tf);
		// input_panel.add(encrypt);
		// input_panel.add(decrypt);

		// JPanel output_panel = new JPanel();
		// JTextArea ta = new JTextArea();
		// output_panel.add(ta);
		// JButton testbutton = new JButton("test");
		// output_panel.add(testbutton);

		// frame.getContentPane().add(BorderLayout.NORTH, menu);
		// frame.getContentPane().add(BorderLayout.CENTER, input_panel);
		// frame.getContentPane().add(BorderLayout.SOUTH, output_panel);
		frame.setVisible(true);
    }
}