/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predialCalculate;

import java.util.Date;
import java.util.Properties;

import static predialCalculate.Use.RESIDENTIAL;

/**
 *
 * @author luism
 */
public class PredialCalculate {
    
    Farm[] farms;
    Properties rateByValue;
    Properties rateByStrata;

    public PredialCalculate(Farm[] farms, Properties rateByValue, Properties rateByStrata) {
		this.farms = farms;
		this.rateByValue = rateByValue;
		this.rateByStrata = rateByStrata;
	}

	
	public Farm searchFarm(String address) {
		Farm result = null;
        for (int i = 0; i < farms.length; i++) {
            if(farms[i] != null && address.equals(farms[i].getAddress())){
            	
                result = farms[i];
            }
        }
		return result;
	}

	public long calculateValue(boolean answer1, boolean answer2, Farm farm1) {
        long value = 0;
        long catastralValuation = farm1.getCatastralValuation();
        if(farm1.getUse() == 'C'){
        	double rate = caltulateRateByCommercial(catastralValuation);
            value = (long) (catastralValuation * rate/1000);
        }else{
            String strata = String.valueOf(farm1.getStrata());
            Double rate = Double.parseDouble(rateByStrata.getProperty(strata));
            value = (long) (catastralValuation * rate/1000);
        }
        value = calculateDiscount(answer1, answer2, value);
        return value;
    }
	
	public double caltulateRateByCommercial(long value) {
        String rate = (value <= Long.parseLong(rateByValue.getProperty("range1"))?
        		rateByValue.getProperty("rate1"):
        			value <= Long.parseLong(rateByValue.getProperty("range2"))?
        					rateByValue.getProperty("rate2"):
        						value <= Long.parseLong(rateByValue.getProperty("range3"))?
        								rateByValue.getProperty("rate3"):
        									value <= Long.parseLong(rateByValue.getProperty("range4"))?
        											rateByValue.getProperty("rate4"):
        												value <= Long.parseLong(rateByValue.getProperty("range5"))?
        														rateByValue.getProperty("rate5"):rateByStrata.getProperty("rate6"));
        return Double.parseDouble(rate);
	}
    
    public long calculateDiscount(boolean answer1, boolean answer2, long value){
        double discount = 0;
        if(answer1){
            discount = value * 0.15; 
        }
        if(answer2){
            discount += value *0.80;
        }
        return (long) (value - discount);
    }
    
}
