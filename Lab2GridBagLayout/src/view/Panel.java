package view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Panel extends JPanel{
	
	private JLabel img;
	private JTextField txtName, txtAdress, txtCity, txtState;
	private JComboBox<String> cbStores;
	private JList stores;
	private JScrollPane stores3;
	private JButton btn1, btn2, addStore, deteleStpore, addItem, deteleItem, oldItem, deteleRange, report;
	private JPanel panelImagen,panelOpciones, panelSucursales,panelExtension; 
	
	public Panel(ActionListener listener) {
		initComponents(listener);
	}
	
	private void initComponents(ActionListener listener) {
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		this.setLayout(gbl);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 5;
		gbc.gridheight = 2;
		panelImagen = new JPanel();
		img = new JLabel();
		ImageIcon iconTitulo = new ImageIcon("data/titulo.png");
		img.setIcon(iconTitulo);
		panelImagen.add(img);
		add(panelImagen, gbc);
		
		panelExtension = new JPanel();
		panelExtension.setLayout(new GridLayout(7,1));
		addStore = new JButton("Agregar Sucursal");
		addStore.setActionCommand("addStore");
		addStore.addActionListener(listener);
		panelExtension.add(addStore);
		deteleStpore = new JButton("Eliminar Sucursal");
		deteleStpore.setActionCommand("deteleStpore");
		deteleStpore.addActionListener(listener);
		panelExtension.add(deteleStpore);
		addItem = new JButton("Lanzar Línea De Producto");
		deteleStpore.setActionCommand("addItem");
		deteleStpore.addActionListener(listener);
		panelExtension.add(addItem);
		deteleItem = new JButton("Descontinuar Línea de Producto");
		deteleStpore.setActionCommand("deteleItem");
		deteleStpore.addActionListener(listener);
		panelExtension.add(deteleItem);
		oldItem = new JButton("Línea de Producto más Antigua");
		deteleStpore.setActionCommand("oldItem");
		deteleStpore.addActionListener(listener);
		panelExtension.add(oldItem);
		deteleRange = new JButton("Eliminar dato un Rango");
		deteleStpore.setActionCommand("deteleRange");
		deteleStpore.addActionListener(listener);
		panelExtension.add(deteleRange);
		report = new JButton("Generar Reporte");
		deteleStpore.setActionCommand("report");
		deteleStpore.addActionListener(listener);
		panelExtension.add(report);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.gridheight = 7;
		add(panelExtension, gbc);
		
		panelSucursales = new JPanel();	
		panelSucursales.setLayout(new GridLayout(7,1));
		cbStores = new JComboBox<String>();
		panelSucursales.add(cbStores);
		stores3 = new JScrollPane();
		stores3.setBounds(20, 120,220, 80);
		stores3.setViewportView(stores);
		panelSucursales.add(stores3);
		gbc.gridx = 2;
		gbc.gridwidth = 3;
		gbc.gridheight = 7;
		add(panelSucursales, gbc);	
		
		panelOpciones = new JPanel();
		panelOpciones.setLayout(gbl);
		btn1 = new JButton("Opcion 1");
		btn1.setActionCommand("btn1");
		btn1.addActionListener(listener);
		GridBagConstraints gbc1=new GridBagConstraints();
		gbc1.fill=GridBagConstraints.HORIZONTAL;
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		gbc1.gridwidth = 2;
		gbc1.gridheight = 1;
		panelOpciones.add(btn1, gbc1);
		btn2 = new JButton("Opcion 2");
		btn2.setActionCommand("btn2");
		btn2.addActionListener(listener);
		gbc1.gridx = 2;
		gbc1.gridy = 0;
		gbc1.gridwidth = 2;
		gbc1.gridheight = 1;
		panelOpciones.add(btn2, gbc1);
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.gridwidth = 5;
		gbc.gridheight = 1;
		add(panelOpciones, gbc);
		
		
		
	}
}