package test;

class Rectangle extends Shape {

    private double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        double a = l * b;
        System.out.println("Area of Rectangle = " + a);
    }
}