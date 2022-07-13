package presenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import model.Cat;
import model.Cats;
import persistence.WebConsumer;
import view.CalculatorView;

public class Presenter implements ActionListener{
	
	private CalculatorView view;
	
	public Presenter() {
    	view = new CalculatorView(this);
        run();
    }
	
	@Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equals("search")) {
			try {
				writeJson(view.getCbAnimal());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
    
    public void writeJson(String parameter) throws FileNotFoundException {
    	
    		WebConsumer web = new WebConsumer();
    		String url1 = "https://cat-fact.herokuapp.com/facts/random?animal_type=";
    		
    		String webConsumer = web.WebServicePlainReader(url1+parameter+"&amount=1");
    		
    		System.out.println(webConsumer);
    		
    		PrintWriter print = new PrintWriter("data/nuevoArchivo.json");
    		print.write(webConsumer);
    		print.close();
    		readJson();
    }
    
    public void readJson() throws FileNotFoundException {
    	JsonReader reader = new Gson().newJsonReader(new FileReader("data/nuevoArchivo.json"));
		Cat emp = new Gson().fromJson(reader, Cat.class);
		
		view.setAnimalEmply(emp.getText());
		view.setIdEmply(emp.get_id());
		view.setCreateEmply(emp.getCreatedAt());
		System.out.println(emp);
		
		/*Cat[] emps = emp.getCats();
		for(int i = 0; i < emps.length; i++) {
			view.setAnimalEmply(emps[i].getText());
			view.setIdEmply(emps[i].get_id());
			view.setCreateEmply(emps[i].getCreatedAt());
			System.out.println(emps[i]);
		}*/
    }
    
    public void run() {}
    
    public static void main(String [] args) {
        new Presenter();	
    }

}
