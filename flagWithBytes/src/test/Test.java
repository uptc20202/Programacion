package test;

import model.BmpFlag;

public class Test {
	
	public static void main(String[] args) {
		BmpFlag file = new BmpFlag("data/exampleHeader.bmp",200,300);
		file.toPaint();
		file.toCopy("data/copia.bmp");
		
	}
}
