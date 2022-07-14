package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Word;

public class DialojView extends JPanel{
	
	private JLabel word, synonymsLabel;
	private JComboBox<String> words;
	private JTextField synonymsInput;
	private JButton accept, cancel;
	
	public DialojView(ActionListener listener, ArrayList<Word> synonyms) {
		initComponents(listener, synonyms);
	}
	
	private void initComponents(ActionListener listener, ArrayList<Word> synonyms) {
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		this.setLayout(gbl);
		
		word = new JLabel(" Palabra: ");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(word, gbc);
		
		words = new JComboBox<String>();
		for(Word synonyms1 : synonyms) {
			words.addItem(synonyms1.getWord());
		};
		gbc.gridx = 1;
		add(words, gbc);
		
		synonymsLabel = new JLabel(" Nueva sinonimo: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(synonymsLabel, gbc);
		
		synonymsInput = new JTextField(20);
		gbc.gridx = 1;
		add(synonymsInput, gbc);
		
		accept = new JButton("Aceptar");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(accept, gbc);
		
		cancel = new JButton("Cancelar");
		gbc.gridx = 1;
		add(cancel, gbc);
		
			
	}

}
