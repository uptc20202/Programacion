package model;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class HellowWorld_V3 extends JFrame {
	
	public HellowWorld_V3(){
		super("Mi primera GUI");
		this.setSize(300, 200);
		JLabel etiqueta = new JLabel("¡Hola, Mundo!");
		 etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.
		CENTER);
		 getContentPane().add(etiqueta);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new HellowWorld_V3();
	}
}
