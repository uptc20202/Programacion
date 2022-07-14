package model;

public class Word {
	
	private String Word;
	private String translate;
	
	

	public Word(String word, String translate) {
		super();
		Word = word;
		this.translate = translate;
	}

	public String getWord() {
		return Word;
	}

	public String getTranslate() {
		return translate;
	}

	public void setWord(String word) {
		Word = word;
	}

	public void setTranslate(String translate) {
		this.translate = translate;
	}

	

}
