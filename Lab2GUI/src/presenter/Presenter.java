package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JDialog;

import model.Dictionary;
import model.Word;
import model.XMLTest;
import view.View;

public class Presenter implements ActionListener{
	
	private View view;
	private Dictionary dictionary;
	private ArrayList<String> synonyms;
	private int position;
	private JDialog synonymsWindow;
	private XMLTest xMLTest;
	
	public Presenter() {
    	view = new View(this);
    	dictionary = new Dictionary("data/words.json");
    	xMLTest = new XMLTest();
        
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if (command.equals("findSynonyms")) {
			String word = view.getWordInput();
			synonyms = dictionary.searchSynonyms(word);
			position = 0;
			view.setSynonyms(synonyms.get(position));
			view.setSynonymsCount("Synonyms number: "+synonyms.size());
		}

		if(command.equals("-")&& position > 0) {
			position = position-1;
			view.setSynonyms(synonyms.get(position));
		}
		if(command.equals("+")&& position <= synonyms.size()) {
			position = position+1;
			view.setSynonyms(synonyms.get(position));
		}
		if(command.equals("addWord")) {
			dictionary.setWords(new Word(view.getWordInput()));
		}
		if(command.equals("AddSynonym")) {
			view.initComponentsDialog(this, dictionary.getWords());
			
		}
	}
	
	public static void main(String [] args) {
        new Presenter();	
    }

}
