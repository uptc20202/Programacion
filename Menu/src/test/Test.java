package test;

import java.util.Scanner;

public class Test {
	
	public Test() {
		
	}
	
	public void run() {
		
	}
	
	public static void main(String [] args) {
		for(int i = 0; i < 10; i++ ) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Termine");
	}
	
	
}
