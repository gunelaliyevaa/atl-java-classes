package az.atlacademy.module01.lesson08_p1;

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
