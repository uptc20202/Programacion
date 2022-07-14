package model;

public class Enterprise {
	private Truck[] trucks;
	private final static int MAX_TRUCKS = 10;

	public Enterprise() {
		trucks = new Truck[MAX_TRUCKS];
	}

	public void addTruck(Truck truck, int position) {
		trucks[position] = truck;
	}

	public String maxCapacity() {
		String maxCapacity = "";
		int capacity = 0;
		int position = 0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				if (trucks[i].getCapacity() > capacity) {
					capacity = trucks[i].getCapacity();
					position = i;
				}
			}
		}
		maxCapacity = trucks[position].getLicensePlate();
		return maxCapacity;
	}

	public int totalCapacity() {
		int totalCapacity = 0;
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] != null) {
				totalCapacity = totalCapacity + trucks[i].getCapacity();
			}
		}
		return totalCapacity;
	}

	public double avgConsumption() {
		double avgConsumption = 0;
		double total = 0;
		int counter = 0;
		for (int i = 0; i < trucks.length; i++) {
			if(trucks[i] != null) {
				total = total + trucks[i].getConsumption();
				counter++;
			}
		}
		avgConsumption = total/counter;
		return avgConsumption;

	}

}
