package az.atlacademy.module01.lesson08_p3.Instruments;

public class Guitar extends Instruments{
    @Override
    public void play() {
        System.out.println(Guitar.class.getName());
    }
}
