package task10;

public class Circle {
    // Data member
    private double radius;

    // Constructors
    public Circle() {
        // Default constructor with no arguments
        radius = 0.0;
    }

    public Circle(double radius) {
        // Constructor with one argument
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create Circle objects using both constructors
        Circle circle1 = new Circle(); // Default constructor
        Circle circle2 = new Circle(5.0); // Constructor with one argument

        // Calculate circumference for both circles
        double circumference1 = circle1.calculateCircumference();
        double circumference2 = circle2.calculateCircumference();

        // Print the circumferences
        System.out.println("Circumference of circle1: " + circumference1);
        System.out.println("Circumference of circle2: " + circumference2);
    }
}
