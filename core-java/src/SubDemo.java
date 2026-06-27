
public class SubDemo<T, P> extends Demo<T> {
	private P temp;
	
	public SubDemo(T data, P temp) {
		super(data);
		this.temp = temp;
	}

	public P getTemp() {
		return temp;
	}
	public void setTemp(P temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
		SubDemo<String, Integer> sd = new SubDemo<String, Integer>("Mona", 99);
		System.out.println(sd.getData() + "\t" + sd.getTemp());
		
		SubDemo<Integer, Person> s2 = new SubDemo<Integer, Person>(101, new Person("Bob", 23));
		System.out.println(s2.getData() + "\t" + s2.getTemp());
	}
}
