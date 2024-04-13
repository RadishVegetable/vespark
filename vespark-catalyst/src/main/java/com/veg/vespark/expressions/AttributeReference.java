package com.veg.vespark.expressions;

import java.util.Objects;

public class AttributeReference extends Attribute{

    private final String name;

    public AttributeReference(String name) {
        this.name = Objects.requireNonNull(name, "name is null");
    }

    @Override
    public Object eval(Object input) {
        /**
         *  input为数据行，返回对应字段的值.
         */
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttributeReference o1 = (AttributeReference) o;
        return name.equals(o1.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
