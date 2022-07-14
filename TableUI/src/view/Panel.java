package view;

import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Panel extends JPanel{
	
	private CardLayout cardLayout;
	private JPanel firstPanel, secondPanel, thridpanel, containterPanel;
	private JButton changeTable, chageGraphic;
	private JScrollPane container1;
	private JTable table;
	

	public Panel(ActionListener listener) {
		initComponents(listener);
	}
	
	private void initComponents(ActionListener listener) {
		
		cardLayout = new CardLayout();
		
		containterPanel = new JPanel();
		containterPanel.setLayout(cardLayout);
		firstPanel = new JPanel();
	    secondPanel = new JPanel();
	    thridpanel = new JPanel();
		
		containterPanel.add(firstPanel, "firstPanel");
		containterPanel.add(secondPanel, "secondPanel");
		containterPanel.add(thridpanel, "thridpanel");
        cardLayout.show(containterPanel, "firstPanel");
        add(containterPanel);
        
        changeTable = new JButton("Barra de Datos");
        add(changeTable);
        
        chageGraphic = new JButton("Grafica Pastel");
        add(chageGraphic);
        
        
	}
	
	private void paintFist(ActionListener listener) {
		
		DefaulTableModel mod = new DefaulTableModel(, cabezera);
		
	}
	
	public void paintComponent(Graphics g) {
		
	}
	
}
