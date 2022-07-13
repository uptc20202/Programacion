package test;

import persistence.BmpFile;

public class Test {

	public static void main(String[] args) {
		BmpFile file = new BmpFile("data/koala.bmp");
		System.out.println(file.getImageSize());
		file.createCopyToCut("data/copia.bmp");
		System.out.println(file.getImageSize() +" "+ file.getFileSize() +" "+ 
		file.getPointSize());
		file.colorToImage();
		file.toCopy("data/copia1.bmp");
		
	}

}
