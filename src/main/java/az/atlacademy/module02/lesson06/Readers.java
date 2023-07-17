package az.atlacademy.module02.lesson06;

import java.math.BigDecimal;

public class Readers {
    private String first_name;
    private String last_name;
    private BigDecimal phone_number;

    public Readers(String first_name, String last_name, BigDecimal phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public BigDecimal getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(BigDecimal phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Readers{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }
}
