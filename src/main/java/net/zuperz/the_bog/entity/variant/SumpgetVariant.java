package net.zuperz.the_bog.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum SumpgetVariant {
    DEFAULT(0),
    BOG_SUMPGET(1);

    private static final SumpgetVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SumpgetVariant::getId)).toArray(SumpgetVariant[]::new);
    private final int id;

    SumpgetVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SumpgetVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}