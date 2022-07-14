package view;

import java.awt.FlowLayout;
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

public class PanelView extends JPanel{
	
	private JLabel tittle, name, adress, paid, pone, city, state;
	private JTextField txtName, txtAdress, txtCity, txtState;
	private JComboBox<String> cbPaid;
	private JButton btnPaid, btnCancel;
	
	public PanelView(ActionListener listener) {
		initComponents(listener);
	}
	
	private void initComponents(ActionListener listener) {
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		this.setLayout(gbl);
		tittle = new JLabel("Pague ahora");
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		add(tittle, gbc);
		
		name = new JLabel("name");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.WEST;
		gbc.gridwidth=1;
		add(name, gbc);
		
		txtName = new JTextField(10);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(txtName, gbc);
		
		adress = new JLabel("addres");
		gbc.gridwidth = 1;
		add(adress, gbc);
		
		txtAdress = new JTextField(10);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(txtAdress, gbc);

		city = new JLabel("city");
		gbc.gridwidth = 1;
		add(city, gbc);
		
		txtCity = new JTextField(10);
		add(txtCity, gbc);
		
		state = new JLabel("state");
		add(state, gbc);
		
		txtState = new JTextField(10);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		add(txtState, gbc);

		paid = new JLabel("paid");
		gbc.gridwidth = 1;
		add(paid, gbc);

		cbPaid = new JComboBox<String>();
		cbPaid.addItem("Visa");
		cbPaid.addItem("MasterCard");
		cbPaid.addItem("AmericanExpress");
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.fill=GridBagConstraints.NONE;
		add(cbPaid, gbc);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new FlowLayout());
		btnPaid = new JButton("Pagar");
		buttonsPanel.add(btnPaid);
		btnCancel = new JButton("Cancelar");
		buttonsPanel.add(btnCancel);
		gbc.anchor=GridBagConstraints.SOUTH;
		add(buttonsPanel, gbc);

		//primera fila – componente tittle
		 gbc.insets=new Insets(0,0,10,0);
		//segunda fila - componente name
		 gbc.insets=new Insets(0,0,0,0);
		//quinta fila - componente chkPaid
		 gbc.insets=new Insets(5,0,5,0);
		//panel de botones
		 gbc.insets=new Insets(15,0,0,0);
	}
}
