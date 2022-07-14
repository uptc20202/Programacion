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
	private JDialog synonymsWindow;
	private DialojView dialog1;

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
	
	public void initComponentsDialog(ActionListener listener, ArrayList<Word> synonyms) {
		synonymsWindow = new JDialog();
		synonymsWindow.setTitle("Add Synonyms");
		synonymsWindow.setSize(400, 300);
		synonymsWindow.setBackground(Color.LIGHT_GRAY);
		dialog1 = new DialojView(listener, synonyms);
		synonymsWindow.setContentPane(dialog1);
		synonymsWindow.setVisible(true);
		
	}
	
	public void setSynonyms(String synonym) {
		panel.setSynonyms(synonym);
	}
	
	public String getWordInput(){
		return panel.getWordInput();
	}
	
	public void setSynonymsCount(String synonymsCount) {
		panel.setSynonymsCount(synonymsCount);;
	}



}
