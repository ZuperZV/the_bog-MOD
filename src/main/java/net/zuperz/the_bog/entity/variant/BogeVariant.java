package net.zuperz.the_bog.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum BogeVariant {
    DEFAULT(0),
    ALEX(1);

    private static final BogeVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(BogeVariant::getId)).toArray(BogeVariant[]::new);
    private final int id;

    BogeVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static BogeVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}