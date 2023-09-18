package opplabs;

abstract class Shape {
    protected abstract double calculateArea();

    public void printArea() {
        System.out.println("Area: " + calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(5);

        rectangle.printArea();
        circle.printArea();
    }
}
