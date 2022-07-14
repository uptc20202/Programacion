package view;

import java.util.Scanner;

public class ViewConsole {
	private Scanner console;
	
	public ViewConsole() {
		console = new Scanner(System.in);
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
	
	public int read(String message) {
		System.out.println(message);
		int readText = Integer.parseInt(console.nextLine());
		return readText;
	}

}
