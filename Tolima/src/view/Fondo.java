package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fondo extends JPanel {
	
	private ImageIcon image;
	private String url;
	
	public Fondo(String url) {
		this.url = url;
	}
	
	public void paintComponent(Graphics g) {
		Dimension sizeJPanel = getSize();
		image = new ImageIcon(getClass().getResource(url));
		g.drawImage(image.getImage(), 0,0, sizeJPanel.width, sizeJPanel.height, null);
		setOpaque(false);
		//super.paint(g);
	}
}
