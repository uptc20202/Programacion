package view;

import java.util.Scanner;

public class ConsoleView implements IView {
	
	private Scanner console;
	
	@Override
	public String getTxtSide1() {
		// TODO Auto-generated method stub
		System.out.println("Inserte La Dirección del Predio: ");
		return console.nextLine();
	}

	@Override
	public String getTxtSide2() {
		// TODO Auto-generated method stub
		System.out.println("Avaluo catastral: ");
		return console.nextLine();
	}

	@Override
	public String getTxtSide3() {
		// TODO Auto-generated method stub
		System.out.println("Avaluo catastral: ");
		return console.nextLine();
	}

	@Override
	public boolean getTxtSide4() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getTxtSide5() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setResult1(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResult2(String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setResult3(String message) {
		// TODO Auto-generated method stub
		
	}

}
