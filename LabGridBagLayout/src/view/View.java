package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class View extends JFrame{
	
	private PanelView panel;

	public View(ActionListener listener) {
		super("Formulario de pago");
		this.setSize(400, 300);
		this.setBackground(Color.LIGHT_GRAY);
		initComponents(listener);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void initComponents(ActionListener listener) {
		panel = new PanelView(listener);
		this.setContentPane(panel);
	}


}
