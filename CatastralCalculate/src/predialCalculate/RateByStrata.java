/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predialCalculate;

/**
 *
 * @author luism
 */
public enum RateByStrata {
    ONE(4), TWO(5.5), THREE(6.75), FOUR(7.75), FIVE(8.5), SIX(10.5);
    
    private double rateByStrata;
    
    private RateByStrata(double rateByStrata){
        this.rateByStrata=rateByStrata;
    }
    
    public void setRateByStrata(double rateByStrata) {
        this.rateByStrata = rateByStrata;
    }

    public double getRateByStrata() {
        return rateByStrata;
    }

    
    
}

