package az.atlacademy.module01.lesson19.Shape;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();
        call(rectangle);
        call(square);
        call(circle);

    }

    private static void call(Shape shape) {
        shape.print();
    }

    //Overloaded methods
    /*private static void call(Rectangle rectangle) {
        rectangle.print();
    }

    private static void call(Square square) {
        square.print();
    }

    private static void call(Circle circle) {
        circle.print();
    }*/
}
