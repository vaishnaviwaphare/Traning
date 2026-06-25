package elite;

public class Product {
	private String name;
	private double price;
	
	public Product() {
		
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}


	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}
	
	

}
