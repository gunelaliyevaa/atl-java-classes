package az.atlacademy.module01.lesson12_p3;

import java.util.Optional;

public class GenericsStringsApp {
    public static void main(String[] args) {
        String name = "ABC";
        String name2 = null;
        String name3 = "";

        System.out.println(validateString(name));
        System.out.println(validateString(name2));
        System.out.println(validateString(name3));
    }

    public static Optional<String> validateString(String name) {
        if (name == null || name.isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(name);
        }
    }
}
