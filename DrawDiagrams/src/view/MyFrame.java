package view;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	private MyPanel panel;
	
	public MyFrame() {
		super("My Frame");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new MyPanel();
		this.getContentPane().add(panel);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
	

}
