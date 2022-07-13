package persistence;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BmpFile {
	private byte[] header;
	private byte[] image;
	private String fileName;

	public BmpFile(String fileName) {
		this.fileName = fileName;
		header = new byte[54];
		loadHeader(fileName);
		image = new byte[getImageSize()];	
	}
	
	public void createCopy(String file2){
		try(FileInputStream input = new FileInputStream(fileName);
			FileOutputStream output = new FileOutputStream(file2)) {
			input.read(header);
			output.write(header);
			input.read(image);
			output.write(image);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
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
	
	private void loadHeader(String fileName) {
		try(FileInputStream fis = new FileInputStream(fileName)) {
			fis.read(header);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getFileSize() {
		int size = bytesToInt(header,2,5);
		return size;
	}
	
	public int getImageSize() {
		int size = bytesToInt(header,34,37);
		return size;
	}
	
	public int getPointSize() {
		int size = bytesToInt(header,28,29);
		return size;
	}

	private int bytesToInt(byte[] data, int begin, int end) {
		int number = 0;
		for (int i = begin, exp = 0; i < end; i++, exp++) {
			number += data[i]*Math.pow(256, exp);
		}
		return number;
	}
	
	public byte[] getBytes(int begin, int end) {
		byte[] numbers = new byte[end-begin+1];
		for (int i = begin, pos = 0; i < end; i++, pos++) {
			numbers[pos] = header[i];
		}
		return numbers;
	}
	
	private void intToByte(int data, int since, int until) {
		int number = 0;
		for (int i = since, j = 0; i <= until; i++, j++) {
			number = (int) (data/Math.pow(256, j));
			if(number > 127) {
				number = number - 256;
			}
			header[i] = (byte) number;
		}
	}
	
	public void createCopyToCut(String file2){
		try(FileInputStream input = new FileInputStream(fileName);
			FileOutputStream output = new FileOutputStream(file2)) {
			input.read(header);
			cutToHeader();
			output.write(header);
			input.read(image);
			cutToImage();
			output.write(image);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void cutToHeader() {
		int newImageSize = getImageSize()/2;
		intToByte(newImageSize,34,37);
		int newfileSize = newImageSize + 54;
		intToByte(newfileSize,2,5);
		int newHeigth2 = bytesToInt(header,22,25)/2;
		intToByte(newHeigth2,22,25);
	}
	
	public void cutToImage() {
		int position = image.length/2;
		byte[] numbers = new byte[position];
		for (int i = position, pos = 0; i < image.length; i++, pos++) {
			numbers[pos] = image[i];
		}
		image = numbers;
	}
	
	public void colorToImage() {
		byte[] rgb = new byte[4];
		rgb[0] = (byte)150;
		rgb[1] = 2;
		rgb[2] = 0;
		rgb[3] = (byte)150;
		for(int i = 0; i < image.length; i++) {
			for(int j = 0; j < rgb.length; j++) {
				image[i] = rgb[j];
			
			}
		}
	}
}
