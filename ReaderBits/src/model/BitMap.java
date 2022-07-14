package model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.imageio.ImageIO;

public class BitMap {
	
	public static void main(String[] args)  {
		
		try {
			BufferedImage img = ImageIO.read(new File("datas/2441.bmp"));
			
			System.out.println("Dimenciones de la imagen son " + img.getWidth() + " X " + img.getHeight());
			System.out.println( img.toString());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		

		
		try(FileInputStream fuente = new FileInputStream("datas/2441.bmp");
				BufferedInputStream procesador1 = new BufferedInputStream(fuente);
				ObjectInputStream procesador2 = new ObjectInputStream(procesador1)){
				
				System.out.println(procesador2.readDouble());
				
				byte textBytes[] = new byte[54];
				procesador2.read(textBytes);
				System.out.println(new String(textBytes,0,textBytes.length));
				
				StringBuilder text = new StringBuilder();
				for(int i = 0; i <54; i++) {
					text.append(procesador2.readChar());
				}
				System.out.println(text);
				
		}catch(FileNotFoundException e) {
			System.out.println("Ha ocurrido un error archivo no encontrado");
		}catch(IOException e) {
			System.out.println("Ha ocurrido un error I/O" + " + " + e);
		}
	}
}	

