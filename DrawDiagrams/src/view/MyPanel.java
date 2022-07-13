package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener{
	private JButton button1;

	public MyPanel() {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		g.drawLine(50, 50, 50, 250);
		g.drawLine(50, 250, 250, 250);
		g.drawLine(30, 200, 50, 200);
		g.drawLine(30, 150, 50, 150);
		g.drawLine(30, 100, 50, 100);
		g.drawString("30", 15, 105);
		g.drawString("20", 15, 155);
		g.drawString("10", 15, 205);
		g.fillPolygon( new int[] {40,60,50},new int[] {50,50,40}, 3);
		g.drawString("Y", 47, 38);
		g.fillPolygon( new int[] {250,250,260},new int[] {240,260,250}, 3);
		g.drawString("X", 263, 255);
		g.setColor(Color.RED);
		g.fillRect(55, 100, 50, 150);
		g.setColor(Color.pink);
		g.fillRect(105, 200, 50, 50);
		g.setColor(Color.cyan);
		g.fillRect(155, 150, 50, 100);
		
		g.setColor(Color.black);
		g.drawRect(100, 260, 105, 50);
		g.drawString("Rojo: Perros", 105, 275);
		g.drawString("Rosa: Loros", 105, 290);
		g.drawString("Azul: Gatos", 105, 305);
		
		/*g.setColor(Color.RED);
		g.fillRect(50, 50, 200, 100);
		g.drawRoundRect(50, 50, 200, 100, 30,30);//Redondear circulo
		g.setColor(new Color(0,255,0));
		g.fillOval(250, 150, 100, 100);
		g.setColor(Color.black);
		g.fillArc(350, 50, 100, 100, 270, 90);
		g.setColor(Color.white);
		g.drawString("Jueves", 150, 100);
		g.drawPolygon( new int[] {100,170,150,50,30},new int[] {220,270,350,350,270}, 5);
		g.drawLine(0, 0, 200, 200);
		*/
	}

}
