package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dictionary {
	
	private ArrayList<Word> words;
	
	
	
	public Dictionary(String nameFiel) {
		super();
		this.words = new ArrayList<Word>();
		//loadWord(nameFiel);
		words.add(JSONTest.parseJSON(nameFiel));
	}

	public void loadWord(String nameFiel) {
		try {
			FileReader fuente = new FileReader(nameFiel);
	    	BufferedReader procesador = new BufferedReader(fuente);
	    	
	    	String leido;
	    	while((leido = procesador.readLine()) != null) {
		    	String[] wordLine = leido.split(",");
		    	words.add(readCreateWord(wordLine));
	    	}
	    	procesador.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	public Word readCreateWord(String[] wordText) {
		Word word1 = new Word(wordText[0]);
		for(int i = 1; i < wordText.length; i++) {
			word1.setSynonyms(wordText[i]);
		}
		return word1;
	}
	
	public void addSynonym(String word, String Synonyms) {
		words.get(searchWord(word)).setSynonyms(Synonyms);
	}
	
	public void addWord(String word) {
		words.add(new Word(word));
	}
	
	public int countSynonym(String word) {
		return words.get(searchWord(word)).getSynonyms().size();
	}
	
	public Integer searchWord(String word) {
		
		int i;
        for (i = 0; i < words.size(); i++) {
        	
            if(words.get(i) != null && word.equals(words.get(i).getWord())){
                return i;
            }
        }
		return null;
	}
	
	public ArrayList<String> searchSynonyms(String word) {
		return words.get(searchWord(word)).getSynonyms();
	}
	
	public void changeSynonyms(boolean direction) {

	}

	public ArrayList<Word> getWords() {
		return words;
	}

	public void setWords(Word word) {
		this.words.add(word);
	}
	
	
}
