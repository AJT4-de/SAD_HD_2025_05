package SOLID;
 
public class LSP_01 {
 
    // Liskov Substitution Principle (LSP) Example
    public static abstract class Shape {
        public abstract int getArea();
    }
 

    public static class Rectangle extends Shape {
        protected final int width; 
        protected final int height; 
 
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
 
        public int getWidth() {
            return width;
        }
 
        public int getHeight() {
            return height;
        }
 
        @Override
        public int getArea() {
            return width * height;
        }
    }
 
    public static class Square extends Shape {
        protected final int side; 
 
        public Square(int side) {
            this.side = side;
        }
 
        public int getSide() {
            return side;
        }
 
        @Override
        public int getArea() {
            return side * side;
        }
    }
 
    public static void printAreaDetails(Shape shape) {
        if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            System.out.println("Rectangle (" + r.getWidth() + "x" + r.getHeight() + ") Area: " + shape.getArea());
        } else if (shape instanceof Square) {
            Square s = (Square) shape;
            System.out.println("Square (side " + s.getSide() + ") Area: " + shape.getArea());
        } else {
            System.out.println("Unknown Shape Area: " + shape.getArea());
        }
    }
 
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);
 
        printAreaDetails(rectangle);
        printAreaDetails(square);
 
    }
}