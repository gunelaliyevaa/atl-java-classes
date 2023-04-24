package az.atlacademy.module01.lesson19.Instruments;

public class InstrumentsApp {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Drums drums = new Drums();
        Camera camera = new Camera();

        call(guitar);
        call(piano);
        call(drums);

        Instruments guitar2 = new Guitar();
        call(guitar2);

        System.out.println(guitar2 instanceof Instruments);
        System.out.println(guitar2 instanceof Guitar);

    }

    private static void call(Instruments instruments) {
        instruments.play();
    }

}
