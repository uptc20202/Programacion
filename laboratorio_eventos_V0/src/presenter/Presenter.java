package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Square;
import view.CalculatorView;
import view.ConsoleView;
import view.IView;

public class Presenter implements ActionListener {
	private Square square;
	private IView view;
	
	public Presenter(String mode) {
		switch(mode) {
			case "console":
				view = new ConsoleView();
				run();
				break;
			case "gui":
				view = new CalculatorView(this);
				break;
		}
		//view = new CalculatorView(this);
		view = new ConsoleView();
		run();
	}
	
	private void run() {
		Square square = new Square(Integer.parseInt(view.getSide()));
		view.setResult(String.valueOf(square.calculateArea()));
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equals("calculate")) {
			Square square = new Square(Integer.parseInt(view.getSide()));
			view.setResult(String.valueOf(square.calculateArea()));
		}

	}
	
	public static void main(String[] args) {
		new Presenter(args[0]);
	}
}
