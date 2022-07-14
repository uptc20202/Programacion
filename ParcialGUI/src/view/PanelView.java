	package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelView extends JPanel{
	
	private JLabel word,translate,englishCount, frenchCount, wordSpanish, wordEnglish, 
		wordFrench, translate2,englishCount2, frenchCount2;
	private JTextField wordInput, wordInput2,englishInput, frenchInput;
	private JButton inEnglish, inFrench, addEnglish, addFrench;

	
	public PanelView(ActionListener listener) {
		initComponents(listener);
	}
	
	private void initComponents(ActionListener listener) {
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
		
		wordInput = new JTextField(20);
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		add(wordInput, gbc);
		
		inEnglish = new JButton("en inglés");
		gbc.gridx = 3;
		gbc.gridwidth = 1;
		inEnglish.setActionCommand("inEnglish");
		inEnglish.addActionListener(listener);
		add(inEnglish, gbc);
		
		translate = new JLabel(" Traducción: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(translate, gbc);
		
		translate2 = new JLabel("");
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		add(translate2, gbc);
		
		inFrench = new JButton("en francés");
		gbc.gridx = 3;
		gbc.gridwidth = 1;
		inFrench.setActionCommand("inFrench");
		inFrench.addActionListener(listener);
		add(inFrench, gbc);
		
		englishCount = new JLabel(" Inglés: ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(englishCount, gbc);
		
		englishCount2 = new JLabel("");
		gbc.gridx = 1;
		add(englishCount2, gbc);
		
		frenchCount = new JLabel(" Francés: ");
		gbc.gridx = 2;
		add(frenchCount, gbc);
		
		frenchCount2 = new JLabel("");
		gbc.gridx = 3;
		add(frenchCount2, gbc);
		
		wordSpanish = new JLabel(" En español: ");
		gbc.gridx = 0;
		gbc.gridy = 6;
		add(wordSpanish, gbc);
		
		wordInput2 = new JTextField(20);
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		add(wordInput2, gbc);
		
		wordEnglish = new JLabel(" En inglés: ");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		add(wordEnglish, gbc);
		
		englishInput = new JTextField(20);
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		add(englishInput, gbc);
		
		addEnglish = new JButton("Adicionar");
		gbc.gridx = 3;
		gbc.gridwidth = 1;
		addEnglish.setActionCommand("addEnglish");
		addEnglish.addActionListener(listener);
		add(addEnglish, gbc);
		
		wordFrench = new JLabel(" En francés: ");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridwidth = 1;
		add(wordFrench, gbc);
		
		frenchInput = new JTextField(20);
		gbc.gridx = 1;
		gbc.gridwidth = 2;
		add(frenchInput, gbc);
		
		addFrench = new JButton("Adicionar");
		gbc.gridx = 3;
		gbc.gridwidth = 1;
		addFrench.setActionCommand("addFrench");
		addFrench.addActionListener(listener);
		add(addFrench, gbc);
	}

	public JLabel getWord() {
		return word;
	}

	public JLabel getTranslate() {
		return translate;
	}

	public JLabel getEnglishCount() {
		return englishCount;
	}

	public JLabel getFrenchCount() {
		return frenchCount;
	}

	public JLabel getWordSpanish() {
		return wordSpanish;
	}

	public JLabel getWordEnglish() {
		return wordEnglish;
	}

	public JLabel getWordFrench() {
		return wordFrench;
	}

	public JLabel getTranslate2() {
		return translate2;
	}

	public JLabel getEnglishCount2() {
		return englishCount2;
	}

	public JLabel getFrenchCount2() {
		return frenchCount2;
	}

	public String getWordInput() {
		return wordInput.getText();
	}

	public String getWordInput2() {
		return wordInput2.getText();
	}

	public String getEnglishInput() {
		return englishInput.getText();
	}

	public String getFrenchInput() {
		return frenchInput.getText();
	}

	public JButton getInEnglish() {
		return inEnglish;
	}

	public JButton getInFrench() {
		return inFrench;
	}

	public JButton getAddEnglish() {
		return addEnglish;
	}

	public String getAddFrench() {
		return addFrench.getText();
	}

	public void setWord(JLabel word) {
		this.word = word;
	}

	public void setTranslate2(String translate) {
		this.translate2.setText(translate);
	}

	public void setEnglishCount(JLabel englishCount) {
		this.englishCount = englishCount;
	}

	public void setFrenchCount(JLabel frenchCount) {
		this.frenchCount = frenchCount;
	}

	public void setWordSpanish(JLabel wordSpanish) {
		this.wordSpanish = wordSpanish;
	}

	public void setWordEnglish(JLabel wordEnglish) {
		this.wordEnglish = wordEnglish;
	}

	public void setWordFrench(JLabel wordFrench) {
		this.wordFrench = wordFrench;
	}


	public void setEnglishCount2(String englishCount2) {
		this.englishCount2.setText(englishCount2);;
	}

	public void setFrenchCount2(String frenchCount2) {
		this.frenchCount2.setText(frenchCount2);;
	}

	public void setWordInput(JTextField wordInput) {
		this.wordInput = wordInput;
	}

	public void setWordInput2(JTextField wordInput2) {
		this.wordInput2 = wordInput2;
	}

	public void setEnglishInput(JTextField englishInput) {
		this.englishInput = englishInput;
	}

	public void setFrenchInput(JTextField frenchInput) {
		this.frenchInput = frenchInput;
	}

	public void setInEnglish(JButton inEnglish) {
		this.inEnglish = inEnglish;
	}

	public void setInFrench(JButton inFrench) {
		this.inFrench = inFrench;
	}

	public void setAddEnglish(JButton addEnglish) {
		this.addEnglish = addEnglish;
	}

	public void setAddFrench(JButton addFrench) {
		this.addFrench = addFrench;
	}

	
	
	
}
