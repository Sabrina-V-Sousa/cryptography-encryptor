package gui_classes; 
// javac -d . BackgroundImagePanel.java 

import javax.swing.*;
import java.awt.*;

public class BackgroundImagePanel extends JPanel {
	private Image background_image;

	public BackgroundImagePanel(String image_path) {
		background_image = new ImageIcon(image_path).getImage();
		setLayout(new GridBagLayout());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// scale image
		g.drawImage(background_image, 0, 0, getWidth(), getHeight(), this);
	}
}