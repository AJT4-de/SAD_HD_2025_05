package SOLID;
 
public class OCP_02{
 
    public static abstract class Shape {
        public abstract double getArea();
    }
 
    public static class Square extends Shape {
        private double side;
 
        public Square(double side) {
            this.side = side;
        }
 
        @Override
        public double getArea() {
            return side * side;
        }
    }
 
    public static class Circle extends Shape {
        private double radius;
 
        public Circle(double radius) {
            this.radius = radius;
        }
 
        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
 
    // New shape added without modifying AreaCalculator
    public static class Rectangle extends Shape {
        private double width;
        private double height;
 
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
 
        @Override
        public double getArea() {
            return width * height;
        }
    }
 
    public static class AreaCalculator {
        public double getArea(Shape shape) {
            return shape.getArea(); 
        }
    }
 
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
 
        Shape square = new Square(5);
        System.out.println("Area of Square: " + calculator.getArea(square));
 
        Shape circle = new Circle(3);
        System.out.println("Area of Circle: " + String.format("%.2f", calculator.getArea(circle)));
 
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + calculator.getArea(rectangle));
    }
}