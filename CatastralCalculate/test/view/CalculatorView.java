package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CalculatorView extends JFrame implements IView {

	private CalculatorPanel panel;

	public CalculatorView(ActionListener listener) {
		super("Calculo del Impuesto Catastral");
		
		try{
			  JFrame.setDefaultLookAndFeelDecorated(true);
			  JDialog.setDefaultLookAndFeelDecorated(true);
			  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			  //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			}
				catch (Exception e)
			 {
			 	e.printStackTrace();
			 }

		
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

	public String getTxtSide1() {
		return panel.getTxtSide1();
	}
	
	public String getTxtSide2() {
		return panel.getTxtSide2();
	}
	
	public String getTxtSide3() {
		return panel.getTxtSide3();
	}
	
	public boolean getTxtSide4() {
		return panel.getTxtSide4();
	}
	
	public boolean getTxtSide5() {
		return panel.getTxtSide5();
	}
	
	public void setResult1(String value) {
		panel.setResult1(value);
	} 
	
	public void setResult2(String value) {
		panel.setResult2(value);
	}
	
	public void setResult3(String value) {
		panel.setResult3(value);
	}
}
