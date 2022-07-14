package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Word;

public class View extends JFrame{
	
	private PanelView panel;

	public View(ActionListener listener) {
		super("Synonyms Dictionary");
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
	
	public String getWordInput() {
		return panel.getWordInput();
	}
	
	public void setTranslate2(String translate) {
		this.panel.setTranslate2(translate);
	}
	
	public void setEnglishCount2(String englishCount2) {
		this.panel.setEnglishCount2(englishCount2);;
	}

	public void setFrenchCount2(String frenchCount2) {
		this.panel.setFrenchCount2(frenchCount2);;
	}
	
	public String getWordInput2() {
		return panel.getWordInput2();
	}

	public String getEnglishInput() {
		return panel.getEnglishInput();
	}
	
	public String getFrenchInput() {
		return panel.getFrenchInput();
	}

}
