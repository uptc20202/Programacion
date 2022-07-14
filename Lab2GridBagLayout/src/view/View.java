package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class View extends JFrame{
	
	private Panel panel;

	public View(ActionListener listener) {
		super("Cup-E-Mart");
		this.setSize(600, 600);
		this.setBackground(Color.LIGHT_GRAY);
		initComponents(listener);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void initComponents(ActionListener listener) {
		panel = new Panel(listener);
		this.setContentPane(panel);
	}


}
