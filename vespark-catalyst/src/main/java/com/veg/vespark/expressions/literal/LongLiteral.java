package com.veg.vespark.expressions.literal;

import java.util.Objects;

public class LongLiteral extends Literal{
    private final long value;

    public LongLiteral(String value) {
        this.value = Long.parseLong(Objects.requireNonNull(value, "value is null"));
    }


    @Override
    public Object eval(Object input) {
        return value;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LongLiteral o1 = (LongLiteral) o;
        return value == o1.value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
