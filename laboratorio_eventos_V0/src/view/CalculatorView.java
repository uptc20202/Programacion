package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Square;

public class CalculatorView extends JFrame  implements IView{

	private CalculatorPanel panel;

	public CalculatorView(ActionListener listener) {
		super("Calculo del area de un cuadrado");
		this.setSize(300, 100);
		initComponents(listener);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void initComponents(ActionListener listener) {
		panel = new CalculatorPanel(listener);
		this.setContentPane(panel);
	}

	public String getSide() {
		return panel.getSide();
	}
	
	public void setResult(String value) {
		panel.setResult(value);
	} 
}
