package az.atlacademy.module01.lesson14;

import java.util.Objects;

public final class Box<T> {
    private final boolean isEven;
    private final T data;

    public Box(boolean isEven, T data) {
        this.isEven = isEven;
        this.data = data;
    }

    public boolean isEven() {
        return isEven;
    }

    public T getData() {
        return data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return isEven == box.isEven && Objects.equals(data, box.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEven, data);
    }

    @Override
    public String toString() {
        return "Box{" +
                "isEven=" + isEven +
                ", data=" + data +
                '}';
    }
}

