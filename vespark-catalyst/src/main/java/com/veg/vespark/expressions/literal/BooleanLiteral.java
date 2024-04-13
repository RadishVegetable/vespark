package com.veg.vespark.expressions.literal;

import java.util.Objects;

public class BooleanLiteral extends Literal {
    public final BooleanLiteral TRUE_LITERAL = new BooleanLiteral("TRUE");
    public final BooleanLiteral FALSE_LITERAL = new BooleanLiteral("FALSE");

    private final boolean value;

    public BooleanLiteral(String value) {
        this.value = Boolean.parseBoolean(Objects.requireNonNull(value, "value is null"));
    }

    @Override
    public Object eval(Object input) {
        return value;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BooleanLiteral o1 = (BooleanLiteral) o;
        return value == o1.value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
