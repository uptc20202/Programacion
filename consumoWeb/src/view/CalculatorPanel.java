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
	
	private JLabel lblAnimal, lblId, lblText, lblCreate, animalEmply, idEmply, createEmply;
	private JComboBox<String> cbAnimal;
	private JButton search;
	
	public CalculatorPanel(ActionListener listener) {
		initComponents(listener);
	}
	
	private void initComponents(ActionListener listener) {
		
		this.setLayout(new GridLayout(5,2));
	
		lblAnimal = new JLabel(" Seleccione un animal ");
		add(lblAnimal);
		
		cbAnimal = new JComboBox<String>();
		cbAnimal.addItem("cat");
		cbAnimal.addItem("dog");
		cbAnimal.addItem("horse");
		add(cbAnimal);
		
		JTextField tre = new JTextField("TRE");	
		add(tre);
		
		lblId = new JLabel(" Id");
		add(lblId);
		
		idEmply = new JLabel();
		add(idEmply);
		
		lblText = new JLabel(" Text");
		add(lblText);
		
		animalEmply = new JLabel();
		add(animalEmply);
		
		lblCreate = new JLabel(" createdAt");
		add(lblCreate);
		
		createEmply = new JLabel();
		add(createEmply);
		
		search = new JButton(" Generar");
		search.setActionCommand("search");
		search.addActionListener(listener);
		add(search);
	
	}

	public String getCbAnimal() {
		return (String) cbAnimal.getSelectedItem();
	}

	public void setAnimalEmply(String e) {
		this.animalEmply.setText(e);
	}

	public void setIdEmply(String e) {
		this.idEmply.setText(e);
	}

	public void setCreateEmply(String e) {
		this.createEmply.setText(e);
	}

	
	
		
}
