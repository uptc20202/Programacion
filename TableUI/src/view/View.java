package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class View extends JFrame{
	
	private Panel panel;
	
	public View(ActionListener listener) {
		this.setSize(700, 700);
		this.setLayout(new GridLayout(4,1));
		initComponents(listener);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void initComponents(ActionListener listener) {
		panel = new Panel(listener);
		this.setContentPane(panel);
	}

}
