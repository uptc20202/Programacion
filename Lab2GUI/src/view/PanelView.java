	package view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class PanelView extends JPanel{
	
	private JLabel word,synonyms,synonymsCount;
	private JTextField wordInput;
	private JButton back, post, findSynonyms, addWord, addSynonym;
	private String text1;
	
	public PanelView(ActionListener listener) {
		initComponents(listener);
	}
	
	private void initComponents(ActionListener listener) {
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints gbc=new GridBagConstraints();
		this.setLayout(gbl);
		
		word = new JLabel(" Word: ");
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(word, gbc);
		
		wordInput = new JTextField(20);
		gbc.gridx = 1;
		gbc.gridwidth = 5;
		add(wordInput, gbc);
		
		findSynonyms = new JButton("Find Synonyms");
		gbc.gridx = 6;
		gbc.gridwidth = 2;
		findSynonyms.setActionCommand("findSynonyms");
		findSynonyms.addActionListener(listener);
		add(findSynonyms, gbc);
		
		
		back = new JButton("<<");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		back.setActionCommand("-");
		back.addActionListener(listener);
		add(back, gbc);
		
		synonyms = new JLabel("");
		gbc.gridx = 1;
		gbc.gridwidth = 7;
		add(synonyms, gbc);
		
		post = new JButton(">>");
		gbc.gridx = 7;
		gbc.gridwidth = 1;
		post.setActionCommand("+");
		post.addActionListener(listener);
		add(post, gbc);
		
		synonymsCount = new JLabel("Synonyms number: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 8;
		add(synonymsCount, gbc);
		
		addWord = new JButton("Add Word");
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		addWord.setActionCommand("addWord");
		addWord.addActionListener(listener);
		add(addWord, gbc);	
		
		addSynonym = new JButton("Add Synonym");
		gbc.gridx = 4;
		gbc.gridwidth = 2;
		addSynonym.setActionCommand("AddSynonym");
		addSynonym.addActionListener(listener);
		add(addSynonym, gbc);
		
		
	}

	public JLabel getWord() {
		return word;
	}

	public JLabel getSynonyms() {
		return synonyms;
	}

	public JLabel getSynonymsCount() {
		return synonymsCount;
	}

	public String getWordInput() {
		return wordInput.getText();
	}

	public JButton getBack() {
		return back;
	}

	public JButton getPost() {
		return post;
	}

	public JButton getFindSynonyms() {
		return findSynonyms;
	}

	public JButton getAddWord() {
		return addWord;
	}

	public JButton getAddSynonym() {
		return addSynonym;
	}

	public String getText1() {
		return text1;
	}

	public void setWord(JLabel word) {
		this.word = word;
	}

	public void setSynonyms(String synonyms) {
		this.synonyms.setText(synonyms);
	}

	public void setSynonymsCount(String synonymsCount) {
		this.synonymsCount.setText(synonymsCount);;
	}

	public void setWordInput(JTextField wordInput) {
		this.wordInput = wordInput;
	}

	public void setBack(JButton back) {
		this.back = back;
	}

	public void setPost(JButton post) {
		this.post = post;
	}

	public void setFindSynonyms(JButton findSynonyms) {
		this.findSynonyms = findSynonyms;
	}

	public void setAddWord(JButton addWord) {
		this.addWord = addWord;
	}

	public void setAddSynonym(JButton addSynonym) {
		this.addSynonym = addSynonym;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}
	
	
}
