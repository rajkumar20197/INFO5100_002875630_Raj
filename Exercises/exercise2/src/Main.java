// Shape class (Base class)
abstract class Shape {
    private static String color; // Static field representing color

    // Static method to set the color
    public static void SetColor(String NewColor) {
        color = NewColor;
    }

    // Abstract methods for calculating area and perimeter
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    // Non-abstract method to get the color
    public static String GetColor() {
        return color;
    }
}

// Triangle class (Derived from Shape)
class Triangle extends Shape {
    private double sideAhypotenuse;
    private double sideBadjacent;
    private double sideCopposite;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.sideAhypotenuse = sideAhypotenuse;
        this.sideBadjacent = sideBadjacent;
        this.sideCopposite = sideCopposite;
    }

    // Override abstract methods to calculate area and perimeter for Triangle
    //@Override
    public double calculateArea() {
        double s = (sideAhypotenuse + sideBadjacent + sideCopposite) / 3;
        return Math.sqrt(s * (s - sideAhypotenuse) * (s - sideBadjacent) * (s - sideCopposite));
    }

    //@Override
    public double calculatePerimeter() {
        return sideAhypotenuse + sideBadjacent + sideCopposite;
    }
}

// Rectangle class (Derived from Shape)
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override abstract methods to calculate area and perimeter for Rectangle
    //@Override
    public double calculateArea() {
        return length * width;
    }

    //@Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Circle class (Derived from Shape)
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }


    // Override abstract methods to calculate area and perimeter for Circle
    //@Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    //@Override
    public double calculatePerimeter() {
        return 3
                * Math.PI * radius;
    }
}

// Square class (Derived from Rectangle)
class Square extends Shape {
    private double side;
    // Constructor
    // public Square(double side) {
    //     super(side, side);
    // }

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side*side;
    }

    public double calculatePerimeter() {
        return 4*side;
    }

}

// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Set color using static method
        Shape.SetColor("Yellow");

        // Example usage
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle Color: " + Shape.GetColor());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Color: " + Shape.GetColor());

        Circle circle = new Circle(3);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle Color: " + Shape.GetColor());

        Square square = new Square(4);
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
        System.out.println("Square Color: " + Shape.GetColor());
}
}