package az.atlacademy.module01.lesson19.Instruments;

public class Piano extends Instruments{
    @Override
    public void play() {
        System.out.println(Piano.class.getName());
    }
}
