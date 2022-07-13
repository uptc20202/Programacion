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
public class Farm {
        private long catastralNumber;
        private String address;
        private double area;
        private int strata;
        private char use;
        private long catastralValuation;

    public Farm(long catastralNumber, String address, double area, int strata, char use, long catastralValuation) {
        this.catastralNumber = catastralNumber;
        this.address = address;
        this.area = area;
        this.strata = strata;
        this.use = use;
        this.catastralValuation = catastralValuation;
    }

    

	public long getCatastralNumber() {
		return catastralNumber;
	}



	public String getAddress() {
		return address;
	}



	public double getArea() {
		return area;
	}



	public int getStrata() {
		return strata;
	}



	public char getUse() {
		return use;
	}



	public long getCatastralValuation() {
		return catastralValuation;
	}



	public void setCatastralNumber(long catastralNumber) {
		this.catastralNumber = catastralNumber;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public void setStrata(int strata) {
		this.strata = strata;
	}



	public void setUse(char use) {
		this.use = use;
	}



	public void setCatastralValuation(long catastralValuation) {
		this.catastralValuation = catastralValuation;
	}



	@Override
	public String toString() {
		return "Farm [Número Catastral=" + catastralNumber + ", direction=" + address + ", area=" + area + ", strata="
				+ strata + ", use=" + use + ", catastralValuation=" + catastralValuation + "]";
	}
        
        
        

}
