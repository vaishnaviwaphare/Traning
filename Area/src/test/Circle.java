package test;

class Circle extends Shape {

    private double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        double a = 3.14 * r * r;
        System.out.println("Area of Circle = " + a);
    }
}