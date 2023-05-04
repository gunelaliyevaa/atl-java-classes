package az.atlacademy.module01.lesson14;

public class ResultBoxApp {
    public static void main(String[] args) {
        Result<String> result1 = validate("nemo");
        Response<String, Integer> data1 = get("Gunel", 20);
        System.out.println(data1);

    }

    public static <T> Result<T> validate(T t) {
        if (t == null) {
            return new Result<>();
        }
        return new Result<>(t, t.getClass().toString());
    }

    public static <T, U> Response<T, U> get(T t, U u) {
        return new Response<>(t, u);
    }
}
