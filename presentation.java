// Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Abstract Class
abstract class Area implements Shape {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double sideD;
    
    public Area(double a, double b, double c, double d) {
        sideA = a;
        sideB = b;
        sideC = c;
        sideD = d;
    }
}

// Concrete Classes
class Rectangle extends Area {
    public Rectangle(double length, double width) {
        super(length, width, length, width);
    }
    
    @Override
    public double calculateArea() {
        return sideA * sideB;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }
}

class Square extends Area {
    public Square(double side) {
        super(side, side, side, side);
    }
    
    @Override
    public double calculateArea() {
        return sideA * sideA;
    }
    
    @Override
    public double calculatePerimeter() {
        return 4 * sideA;
    }
}

// Usage
public class presentation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        
        Square square = new Square(4);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}
