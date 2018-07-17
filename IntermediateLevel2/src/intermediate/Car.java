package intermediate;

public class Car extends Vehicle {
	int mileage;
	String transmissionType, fuelType;
	
	public Car(int id, int age, String manufacturer, int mileage, String transmissionType, String fuelType) {
		super(age, id, manufacturer);
		this.mileage = mileage;
		this.transmissionType = transmissionType;
		this.fuelType = fuelType;
		
		
	}
		
}
