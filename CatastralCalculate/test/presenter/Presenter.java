/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presenter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import predialCalculate.Farm;
import predialCalculate.PredialCalculate;
import predialCalculate.RateByValue;
import predialCalculate.Use;
import view.CalculatorView;

/**
 *
 * @author Luis Miguel Santiago 202023610
 * @date 30/11/2021  
 */
public class Presenter implements ActionListener{
    
	private CalculatorView view;
    PredialCalculate predialCalculate;
    private Farm addressToFarm; 
    Farm[] farms;
    
    public Presenter() {
    	view = new CalculatorView(this);
        run();
    }
    
    
    
    @Override
	public void actionPerformed(ActionEvent event) {
		String command = event.getActionCommand();
		if (command.equals("Search")) {
			addressToFarm = predialCalculate.searchFarm(view.getTxtSide1());
			if(addressToFarm != null) {
				view.setResult1(String.valueOf(addressToFarm.getArea()));
				view.setResult2(String.valueOf(addressToFarm.getUse()));
			}
		}
		if (command.equals("Liquidar") && addressToFarm != null) {
			try {
				addressToFarm.setCatastralValuation(Long.parseLong(view.getTxtSide2()));
				addressToFarm.setStrata(Integer.parseInt(view.getTxtSide3()));
			}catch(NumberFormatException e){
				addressToFarm.setCatastralValuation(1);
				addressToFarm.setStrata(1);
			}	
			boolean answer1 = view.getTxtSide4();
			boolean answer2 = view.getTxtSide5();
			
			view.setResult3("El Valor a pagar es:  $" + String.valueOf(predialCalculate.calculateValue(answer1, answer2, addressToFarm)));

		}
		

	}
    
    public void run() {
    	
    	
	    try {
			readData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    readRate();	
		
    }
    
    public void readData() throws IOException{
    	FileReader fuente = new FileReader("data/predioslist3.txt");
    	BufferedReader procesador = new BufferedReader(fuente);
    	
    	int lengthArray = (int) procesador.lines().count();
    	Farm[] farmsArray = new Farm[lengthArray];
    	int i = 0;
    	procesador.close();
    	procesador = new BufferedReader(new FileReader("data/predioslist3.txt"));
      	String leido;
    	
    	while((leido = procesador.readLine()) != null) {
	    	String[] farmLine = leido.split(",");
	    	farmsArray[i] = readCreateFarm(farmLine);
	    		
    		i++;
    	}
    	procesador.close();
    	
    	this.farms = farmsArray;
    	
    	
    }
    
    public Farm readCreateFarm(String[] farms){
        long catastralNumber = Long.parseLong(farms[0]);
        String direction = farms[1];
        double area = Double.parseDouble(farms[2]);
        int strata = Integer.parseInt(farms[3]); 
        char use = farms[4].charAt(0);
        long catastralValuation = Long.parseLong(farms[5]);
        Farm farm = new Farm(catastralNumber,direction,area,strata,use,catastralValuation);
        return farm;
    }


    public void readRate() {
    	 Properties rateByValue = new Properties();
         Properties p = new Properties();   
         try {
         	p.load(new FileReader("nbproject/ratebystrata.properties"));
         }catch(IOException e){
         	System.out.println("Error " +e);
         }
         try {
         	rateByValue.load(new FileReader("nbproject/ratebyvalue.properties"));
         }catch(IOException e){
         	System.out.println("Error " +e);
         }
         
         predialCalculate = new PredialCalculate(farms,rateByValue, p);
    }
    

    
    
    public static void main(String [] args) {
        new Presenter();	
    }
}
