package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BmpFlag {
	private byte[] header;
	private byte[] image;
	private String fileName;
	
	public BmpFlag(String fileName, int heith, int weith) {
		this.fileName = fileName;
		header = new byte[54];
		image = new byte[(heith*weith)*3];	
		loadHeader(fileName, heith,  weith);
	}
	
	private void loadHeader(String fileName,int heith, int weith) {
		try(FileInputStream fis = new FileInputStream(fileName)) {
			fis.read(header);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		intToByte(image.length,34,37);
		intToByte(image.length+54,2,5);
		intToByte(heith,22,25);
		intToByte(weith,18,21);
	}
	
	public void intToByte(int data, int since, int until) {
		int number = 0;
		for (int i = since, j = 0; i <= until; i++, j++) {
			number = (int) (data/Math.pow(256, j));
			if(number > 127) {
				number = number - 256;
			}
			header[i] = (byte) number;
		}
	}
	
	public void toCopy(String file2){
		try(FileOutputStream output = new FileOutputStream(file2)) {
			
			output.write(header);
			output.write(image);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void toPaint() {
		for(int i = 0; i < image.length; i += (300*3)) {
			colorRed(i);
			colorWhile(i);
		}
	}
	
	public void colorRed(int j) {
		byte[] rgb = new byte[3];
		rgb[0] = 0;
		rgb[1] = 0;
		rgb[2] = (byte) 255;
		
		for(int i = j; i < (300 + j); i += 3) {
			for(int count = 0; count < rgb.length; count++) {
				image[i+coun	t] = rgb[count];
			}
			
		}
		
		for(int i = (300 *2)+j; i < (300 * 3)+j; i += 3) {
			for(int count = 0; count < rgb.length; count++) {
				image[i+count] = rgb[count];
			}
		}
	}
	
	public void colorWhile(int j) {
		for(int i = 300 + j; i < (300 * 2) + j; i += 3) {
			image[i] = (byte)255;
			image[i+1] = (byte)255;
			image[i+2] = (byte)255;
		}
	}
	
	
	
	private int bytesToInt(byte[] data, int begin, int end) {
		int number = 0;
		for (int i = begin, exp = 0; i < end; i++, exp++) {
			number += data[i]*Math.pow(256, exp);
		}
		return number;
	}
	
}
