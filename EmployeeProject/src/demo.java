public class demo<T> {
    private T data;

    public demo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {

//        demo d1 = new demo("Hola");
//        System.out.println(d1.getData());
//
//        demo d2 = new demo(3.14);
//        System.out.println(d2.getData());
//
//        demo d3 = new demo(new Person("kim", 22));
//        System.out.println(d3.getData());

        demo<String> d1 = new demo<String>("hello");
        System.out.println(d1.getData());

    }
}