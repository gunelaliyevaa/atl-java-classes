package az.atlacademy.module01.lesson11;

public class StringApp {

    public static void main(String[] args) {
        String gunel = "Gunel";
        System.out.println(gunel.length());
        String replacedElchin = gunel.replace("l", "sh");
        System.out.println(replacedElchin);
        System.out.println(gunel);

        String gunel2 = new String("Gunel");
        String gunel3 = new String("Gunel");
        System.out.println(gunel2);

        String abc = "Gunel";
        System.out.println(gunel == abc);
        System.out.println(gunel == gunel2);
        System.out.println(gunel.equals(abc));
        System.out.println(gunel.equals(gunel2));

        String elchin = "Gunesh";

        System.out.println(gunel.hashCode());
        System.out.println(abc.hashCode());
        System.out.println(gunel2.hashCode());
        System.out.println(gunel3.hashCode());
        System.out.println(elchin.hashCode());
        System.out.println(replacedElchin.hashCode());


    }

}
