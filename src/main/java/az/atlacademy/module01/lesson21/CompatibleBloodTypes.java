package az.atlacademy.module01.lesson21;

import static az.atlacademy.module01.lesson21.BloodType.A;
import static az.atlacademy.module01.lesson21.BloodType.AB;
import static az.atlacademy.module01.lesson21.BloodType.B;
import static az.atlacademy.module01.lesson21.BloodType.O;

public enum CompatibleBloodTypes {

    FIRST(new BloodType[] {A, B, AB, O}),
    SECOND(new BloodType[] {A, B}),
    THIRD(new BloodType[] {A, AB}),
    FOURTH(new BloodType[] {A, O});

    private final BloodType[] types;

    CompatibleBloodTypes(BloodType[] types) {
        this.types = types;
    }
}
