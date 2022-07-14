package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import presenter.Presenter;

public class View extends JFrame  {
	
	private Panel panel;

	public View(ActionListener listener) {
		// TODO Auto-generated constructor stub
		super("Gobernación del Tolima");
		
		this.setSize(getMaximumSize());
		System.out.println(getMaximumSize());
		initComponents(listener);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	private void initComponents(ActionListener listener) {
		panel = new Panel(listener);
		this.setContentPane(panel);
	}
}
