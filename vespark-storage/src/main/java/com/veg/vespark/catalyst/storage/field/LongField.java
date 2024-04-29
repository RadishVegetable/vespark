package com.veg.vespark.catalyst.storage.field;

import com.veg.vespark.catalyst.storage.Predicate;
import com.veg.vespark.catalyst.storage.common.Type;

import java.io.DataOutputStream;
import java.io.IOException;

public class LongField implements Field {
    private static final long serialVersionUID = 1L;

    private final long         value;

    public long getValue() {
        return value;
    }


    public LongField(long i) {
        value = i;
    }

    public String toString() {
        return Long.toString(value);
    }

    public int hashCode() {
        return Long.hashCode(value);
    }

    public boolean equals(Object field) {
        if (!(field instanceof LongField))
            return false;
        return ((LongField) field).value == value;
    }

    public void serialize(DataOutputStream dos) throws IOException {
        dos.writeLong(value);
    }

    public boolean compare(Predicate.Op op, Field val) {

        LongField iVal = (LongField) val;

        switch (op) {
            case EQUALS:
            case LIKE:
                return value == iVal.value;
            case NOT_EQUALS:
                return value != iVal.value;
            case GREATER_THAN:
                return value > iVal.value;
            case GREATER_THAN_OR_EQ:
                return value >= iVal.value;
            case LESS_THAN:
                return value < iVal.value;
            case LESS_THAN_OR_EQ:
                return value <= iVal.value;
        }

        return false;
    }


    public Type getType() {
        return Type.LONG_TYPE;
    }
}
