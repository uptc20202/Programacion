package presenter;

import model.Enterprise;
import model.Truck;
import view.ViewConsole;

public class Presenter {
	private Enterprise enterprise;
	private ViewConsole view;

	public Presenter() {
		enterprise = new Enterprise();
		view = new ViewConsole();
		run();
	}

	public void run() {
		createTestData();
		Truck truck = readTruck();
		enterprise.addTruck(truck, 4);
		view.showMessage("El Camion con mayor capacidad es el de placa: " + enterprise.maxCapacity());
		view.showMessage("La maxima capacidad de los camiones es: " + enterprise.totalCapacity());
		view.showMessage("El promedio de gasolina consumida es: " + enterprise.avgConsumption());
	}
	
	public Truck readTruck() {
		String licensePlate = view.read("digite placa ");
		int capacity = Integer.parseInt(view.read("digite capacidad "));
		double consumption = Double.parseDouble(view.read("digite consumo "));
		Truck truck = new Truck(licensePlate, capacity, consumption);
		return truck;
	}
	
	public void createTestData() {
		enterprise.addTruck(new Truck("KGF", 123, 4.5), 0);
		enterprise.addTruck(new Truck("cox", 987, 2.5), 1);
		enterprise.addTruck(new Truck("RUH", 103, 3.1), 2);
		enterprise.addTruck(new Truck("FRC", 110, 3.8), 3);
	}

	public static void main(String[] args) {
		new Presenter();
	}
}