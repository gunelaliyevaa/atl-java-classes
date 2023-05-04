package az.atlacademy.module01.lesson14;

import java.util.Objects;

public class Response<T, U> {
    private T t;
    private U u;

    public Response(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getT() {
        return t;
    }

    public void setU(U u) {
        this.u = u;
    }

    @Override
    public String toString() {
        return "Response{" +
                "t=" + t +
                ", u=" + u +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response<?, ?> response = (Response<?, ?>) o;
        return Objects.equals(t, response.t) && Objects.equals(u, response.u);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t, u);
    }
}
