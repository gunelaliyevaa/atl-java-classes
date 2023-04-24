package az.atlacademy.module01.lesson17;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Square...");
    }

}
