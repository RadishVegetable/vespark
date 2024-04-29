package com.veg.vespark.catalyst.storage.field;

import com.veg.vespark.catalyst.storage.Predicate;
import com.veg.vespark.catalyst.storage.common.Type;

import java.io.DataOutputStream;
import java.io.IOException;

public class BooleanField implements Field {

    private static final long serialVersionUID = 1L;

    private final boolean value;

    public BooleanField(boolean value) {
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }


    @Override
    public void serialize(DataOutputStream dos) throws IOException {
        dos.writeBoolean(value);
    }

    @Override
    public boolean compare(Predicate.Op op, Field val) {
        BooleanField iVal = (BooleanField) val;
        switch (op) {
            case EQUALS:
            case LIKE:
                return value == iVal.value;
            case NOT_EQUALS:
                return value != iVal.value;
            case GREATER_THAN:
            case GREATER_THAN_OR_EQ:
            case LESS_THAN:
            case LESS_THAN_OR_EQ:
                return false;
        }
        return false;
    }

    @Override
    public Type getType() {
        return null;
    }
}
