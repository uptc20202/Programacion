package model;

import javax.swing.JFrame;

public class HellowWorld_V2 extends JFrame {
	public HellowWorld_V2(){
		super("Mi primera GUI");
		this.setSize(300, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new HellowWorld_V2();
	}

}