
public class Car {
	private String model;
	private String[] features;
	
	// Var-args: Can only be the last argument of the method
	public Car(String model, String...features) {	
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Feature of " + model);
		for(String f : features) 
			System.out.println(f);
	}
	
	public static void main(String[] args) {
		Car astor = new Car("MG Astor", "Keyless", "ABS", "ADAS", "Cruise");
		astor.specs();
		
	}
}
