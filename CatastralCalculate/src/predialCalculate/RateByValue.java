/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package predialCalculate;

/**
 *
 * @author Luis Miguel Santiago 202023610
 * @date 2/11/2021  
 */
public class RateByValue {
    
    private long range1;
    private long range2;
    private long range3;
    private long range4;
    private long range5;
    
    private double rate1;
    private double rate2;
    private double rate3;
    private double rate4;
    private double rate5;
    private double rate6;

    public RateByValue(long range1, long range2, long range3, long range4, long range5, double rate1, double rate2, double rate3, double rate4, double rate5, double rate6) {
        this.range1 = range1;
        this.range2 = range2;
        this.range3 = range3;
        this.range4 = range4;
        this.range5 = range5;
        this.rate1 = rate1;
        this.rate2 = rate2;
        this.rate3 = rate3;
        this.rate4 = rate4;
        this.rate5 = rate5;
        this.rate6 = rate6;
    }
    
    
    
    public double calculateRate(long value){
        double rate = 0;
        rate = (value <= range1?rate1:value <= range2?rate2:value <= range3?rate3:value <= range4?rate4:value <= range5?rate5:rate6);
        return rate;
    }

    public void setRange1(long range1) {
        this.range1 = range1;
    }

    public void setRange2(long range2) {
        this.range2 = range2;
    }

    public void setRange3(long range3) {
        this.range3 = range3;
    }

    public void setRange4(long range4) {
        this.range4 = range4;
    }

    public void setRange5(long range5) {
        this.range5 = range5;
    }

    public long getRange1() {
        return range1;
    }

    public long getRange2() {
        return range2;
    }

    public long getRange3() {
        return range3;
    }

    public long getRange4() {
        return range4;
    }

    public long getRange5() {
        return range5;
    }
    
    

}
