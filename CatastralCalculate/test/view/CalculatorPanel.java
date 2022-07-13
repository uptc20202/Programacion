package view;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel {
	
	private JLabel lblSearch;
	private JTextField txtSide1;
	private JButton btnSearch;
	private JLabel lblResult1;
	private JLabel lblResult2;
	private JLabel lblResult3;
	private JLabel lblResult4;
	private JLabel lblSide2;
	private JLabel lblSide3;
	private JButton btnCalculate1;
	private JLabel lblResult5;
	private JLabel lblSide4;
	private JTextField txtSide4;
	private JLabel lblSide5;
	private JTextField txtSide5;
	private JComboBox<Boolean> cbValidate1;
	private JComboBox<Boolean> cbValidate2;
	
	
	public CalculatorPanel(ActionListener listener) {
		initComponents(listener);
	}
	
	private void initComponents(ActionListener listener) {
		
		
		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		this.setLayout(gbl);
	
		lblSearch = new JLabel("Inserte La Dirección del Predio: ");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		add(lblSearch, gbc);
		
		txtSide1 = new JTextField(20);
		gbc.gridx = 2;
		gbc.gridwidth = 1;
		add(txtSide1, gbc);
		
		btnSearch = new JButton("Buscar");
		btnSearch.setActionCommand("Search");
		btnSearch.addActionListener(listener);
		gbc.gridx = 3;
		add(btnSearch, gbc);
		
		
		lblResult1 = new JLabel("Area: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		add(lblResult1, gbc);
		lblResult2 = new JLabel("");
		gbc.gridx = 2;
		add(lblResult2, gbc);
		lblResult3 = new JLabel("Uso: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(lblResult3, gbc);
		lblResult4 = new JLabel("");
		gbc.gridx = 2;
		add(lblResult4,gbc);
		
		cbValidate1 = new JComboBox<Boolean>();
		cbValidate1.addItem(false);
		cbValidate1.addItem(true);
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		add(cbValidate1, gbc);
		lblSide2 = new JLabel("¿Se encuentra dentro del periodo de pronto pago? 'True' o 'False' ");
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 3;
		add(lblSide2, gbc);
		cbValidate2 = new JComboBox<Boolean>();
		cbValidate2.addItem(false);
		cbValidate2.addItem(true);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		add(cbValidate2, gbc);
		lblSide3 = new JLabel("¿Se encuentra destro de los requisitos de predio excluido? 'True' o 'False'");
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 3;
		add(lblSide3, gbc);
		lblSide4 = new JLabel("Avaluo catastral: ");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		add(lblSide4, gbc);
		txtSide4 = new JTextField(10);
		gbc.gridx = 2;
		add(txtSide4, gbc);
		lblSide5 = new JLabel("Estrato: ");
		gbc.gridx = 0;
		gbc.gridy = 6;
		add(lblSide5, gbc);
		txtSide5 = new JTextField(1);
		gbc.gridx = 2;
		add(txtSide5, gbc);
		
		JPanel panel4 = new JPanel();
		btnCalculate1 = new JButton("Liquidar");
		btnCalculate1.setActionCommand("Liquidar");
		btnCalculate1.addActionListener(listener);
		panel4.add(btnCalculate1);
		lblResult5 = new JLabel("");
		panel4.add(lblResult5);
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 4;
		add(panel4, gbc);
		
	
	}
	
	public String getTxtSide1() {
		return txtSide1.getText();
	}
	
	public String getTxtSide2() {
		return txtSide4.getText();
	}
	
	public String getTxtSide3() {
		return txtSide5.getText();
	}
	
	public boolean getTxtSide4() {
		return (boolean) cbValidate1.getSelectedItem();
	}
	
	public boolean getTxtSide5() {
		return (boolean) cbValidate2.getSelectedItem();
	}
	
	public void setResult1(String value) {
		lblResult2.setText(value);
	}
	
	public void setResult2(String value) {
		lblResult4.setText(value);
	}
	
	public void setResult3(String value) {
		lblResult5.setText(value);
	}
	
}
