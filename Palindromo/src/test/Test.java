package test;

import model.Sentence;
import java.util.Scanner;

public class Test {
	private Scanner console;
	private Sentence sentence = new Sentence();
	
	public Test() {
		console = new Scanner(System.in);
		run();
	}
	
	public void run() {
		int x = Integer.parseInt(console.nextLine());
		String word = "";
		String[] word1 = new String[x];
		String[] word2 = new String[x];
		for (int i = 0; i < word1.length; i++) {
			word = console.toString();
			word1[i] = word;
			word2[(x-i)] = word;
		}
		
		sentence.setWords1(word1);
		sentence.setWords2(word2);
	}
	
	public static void main(String[] args) {
		new Test();
		
	}
	

}
