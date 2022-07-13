package view;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class CalculatorView extends JFrame {
	
	private CalculatorPanel panel;

	public CalculatorView(ActionListener listener) {
		super("Consumo Json Animales");
		
		this.setSize(700, 700);
		this.setLayout(new GridLayout(4,1));
		initComponents(listener);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		panel = new CalculatorPanel(listener);
		this.setContentPane(panel);
	}
	
	public String getCbAnimal() {
		return panel.getCbAnimal();
	}
	
	public void setAnimalEmply(String e) {
		panel.setAnimalEmply(e);
	}

	public void setIdEmply(String e) {
		panel.setIdEmply(e);
	}

	public void setCreateEmply(String e) {
		panel.setCreateEmply(e);
	}
	

}
