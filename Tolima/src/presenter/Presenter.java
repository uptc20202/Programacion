package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.View;

public class Presenter implements ActionListener{
	
	private View view;
	
	public Presenter() {
    	view = new View(this);
        run();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void run() {}
	
	public static void main(String [] args) {
        new Presenter();	
    }

}
