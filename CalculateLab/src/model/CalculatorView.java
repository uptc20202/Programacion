package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame  implements ActionListener{
	
	private JLabel lblSide;
	private JTextField txtSide;
	private JButton btnCalculate;
	private JLabel lblArea;
	private JLabel lblResult;
	private JPanel panel;

	public CalculatorView() {
	super("Calculo del area de un cuadrado");
	initComponents();
	this.setSize(300, 100);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
	}
	
	private void initComponents() {
		panel = new JPanel();
		lblSide = new JLabel("Lado: ");
		panel.add(lblSide);
		txtSide = new JTextField(5);
		panel.add(txtSide);
		btnCalculate = new JButton("Calcular area");
		btnCalculate.addActionListener(this);
		panel.add(btnCalculate);
		lblArea = new JLabel("Area: ");
		panel.add(lblArea);
		lblResult = new JLabel("");
		panel.add(lblResult);
		this.setContentPane(panel);
	}
	
	public static void main(String[] args) {
		new CalculatorView();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if (source == btnCalculate) {
		Square square = new Square();
		lblResult.setText(String.valueOf(square.calculateArea(Integer.parseInt(txtSide.getText()))));
		txtSide.setText("0");
		}

		
	}


}	