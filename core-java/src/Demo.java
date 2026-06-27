
public class Demo<T> {
	private T data;

	public Demo(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>("Hello");
		System.out.println(d1.getData());
		
		
	}
}
