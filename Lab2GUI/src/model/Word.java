package model;

import java.util.ArrayList;

public class Word {
	
	private String word;
	private ArrayList<String> synonyms;
	
	public Word(String word, ArrayList<String> synonyms) {
		super();
		this.word = word;
		this.synonyms = synonyms;
	}
	
	public Word(String word) {
		this.word = word;
		this.synonyms = new ArrayList<String>();
	}
	
	public Word() {
		this.synonyms = new ArrayList<String>();
	}

	public String getWord() {
		return word;
	}

	public ArrayList<String> getSynonyms() {
		return synonyms;
	}

	public void setSynonyms(String word) {
		synonyms.add(word);
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", synonyms=" + synonyms + "]";
	}
	
	
	
}
