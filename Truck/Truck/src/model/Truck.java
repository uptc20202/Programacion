package model;
public class Truck{
	private String licensePlate;
	private int capacity;
	private double consumption;

	public Truck(String licensePlate, int capacity, double consumption){
		this.licensePlate = licensePlate;
		this.capacity = capacity;
		this.consumption = consumption; 
	}

	public String getLicensePlate(){
		return licensePlate;
	}

	public int getCapacity(){
		return capacity;
	}

	public double getConsumption(){
		return consumption;	
	}
}

 