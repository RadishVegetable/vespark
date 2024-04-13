package com.veg.vespark.expressions.literal;

import java.util.Objects;

public class StringLiteral extends Literal{

    private final String value;

    public StringLiteral(String value) {
        this.value = Objects.requireNonNull(value, "value is null");
    }

    @Override
    public Object eval(Object input) {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StringLiteral o1 = (StringLiteral) o;
        return value.equals(o1.value);
    }

    @Override
    public String toString() {
        return value;
    }
}
