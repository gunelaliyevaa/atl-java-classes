package az.atlacademy.module01.lesson19.Instruments;

public class Guitar extends Instruments{
    @Override
    public void play() {
        System.out.println(Guitar.class.getName());
    }
}
