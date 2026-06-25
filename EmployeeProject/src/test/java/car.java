package test.java;

public class car {
	private String model;
	private String[] features;
	
	public car(String model, String...features) {
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of " + model);
		for(String f : features) {
			System.out.println(f);
		}
	}
	
	public static void main(String[] args) {
		String[] carFeatures = {"Autopilot", "Leather Seats", "Sunroof"}; 
		car c1 = new car("Model S", carFeatures); 
		c1.specs();
	}
}
