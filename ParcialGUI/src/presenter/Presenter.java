package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JDialog;

import model.Dictionary;
import model.Word;
import view.View;

public class Presenter implements ActionListener{
	
	private View view;
	private Dictionary dictionaryEnglish;
	private Dictionary dictionaryFrench;
	
	public Presenter() {
    	view = new View(this);
    	dictionaryEnglish = new Dictionary("data/english.txt");
    	dictionaryFrench = new Dictionary("data/french.txt");
    	view.setEnglishCount2(Integer.toString(dictionaryEnglish.getWords().size()) );
		view.setFrenchCount2(Integer.toString(dictionaryFrench.getWords().size()));
        
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		
		if(command.equals("inEnglish") && !view.getWordInput().isEmpty()) {
			int positionWord = dictionaryEnglish.searchWord(view.getWordInput());
			view.setTranslate2(dictionaryEnglish.getWords().get(positionWord).getTranslate());
		}
		if(command.equals("inFrench")) {
			int positionWord = dictionaryFrench.searchWord(view.getWordInput());
			view.setTranslate2(dictionaryFrench.getWords().get(positionWord).getTranslate());
		}
		if(command.equals("addEnglish")) {
			dictionaryEnglish.addTranslate(view.getWordInput2(), view.getEnglishInput());
			view.setEnglishCount2(Integer.toString(dictionaryEnglish.getWords().size()) );
		}
		if(command.equals("addFrench")) {
			dictionaryFrench.addTranslate(view.getWordInput2(), view.getFrenchInput());
			view.setFrenchCount2(Integer.toString(dictionaryFrench.getWords().size()));
		}
		
	}
	
	public static void main(String [] args) {
        new Presenter();	
    }

}
