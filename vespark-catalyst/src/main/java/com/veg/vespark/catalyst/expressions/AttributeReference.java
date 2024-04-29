package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.Tuple;
import com.veg.vespark.catalyst.storage.TupleDesc;
import com.veg.vespark.catalyst.storage.common.Type;

import java.util.Objects;

public class AttributeReference extends Attribute{



    private final String name;

    public AttributeReference(String name) {
        this.name = Objects.requireNonNull(name, "name is null");
    }

    @Override
    public Tuple eval(Tuple input) {
        if(input instanceof Tuple) {
            Tuple input1 = (Tuple) input;
            TupleDesc tupleDesc = input1.getTupleDesc();
            int index = tupleDesc.fieldNameToIndex(name);
            Tuple tuple = new Tuple(new TupleDesc(new Type[]{tupleDesc.getFieldType(index)}, new String[]{tupleDesc.getFieldName(index)}));
            tuple.setField(0, input1.getField(index));
            return tuple;
        } else {
            throw new RuntimeException();
        }
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

    @Override
    public Attribute toAttribute() {
        return null;
    }
    public String getName() {
        return name;
    }
}
