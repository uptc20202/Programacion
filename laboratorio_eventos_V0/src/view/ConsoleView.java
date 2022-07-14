package view;

import java.util.Scanner;

public class ConsoleView implements IView{

	private Scanner console;
	
	public ConsoleView() {
		console = new Scanner(System.in);
	}
	
	@Override
	public String getSide() {
		// TODO Auto-generated method stub
		System.out.println("Digite el valor para lado ");
		return console.nextLine();
	}

	@Override
	public void setResult(String message) {
		System.out.println("el area es " + message);
		// TODO Auto-generated method stub
		
	}
	


}
