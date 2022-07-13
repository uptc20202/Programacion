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
		button1 = new JButton("Cambiar de Color");
		button1.addActionListener(this);
		add(button1);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Color color = Color.RED;
		Color colorNew = JColorChooser.showDialog(this, "Seleccione el color", color);
		this.setBackground(colorNew);
		
	}
	
	
	
	/*public void paintComponent(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(50, 50, 200, 100);
		//Redondear circulo g.drawRoundRect(50, 50, 200, 100, 30,30);
		g.setColor(new Color(0,255,0));
		g.fillOval(250, 150, 100, 100);
		g.setColor(Color.black);
		g.fillArc(350, 50, 100, 100, 270, 90);
		g.setColor(Color.white);
		g.drawString("Jueves", 150, 100);
		//g.drawPolygon( new int[] {100,170,150,50,30},new int[] {220,270,350,350,270}, 5);
		//g.drawLine(0, 0, 200, 200);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.
	}*/

}
