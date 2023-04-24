package az.atlacademy.module01.lesson17;

public class InheritanceApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 2);

        Square square = new Square(3);
        square.draw();

        Triangle triangle = new Triangle();
        triangle.draw();

        Circle circle = new Circle();
        System.out.println(circle.getHello());
    }
}
