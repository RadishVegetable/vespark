package com.veg.vespark.catalyst.expressions.literal;

import com.veg.vespark.catalyst.expressions.LeafExpression;
import com.veg.vespark.catalyst.storage.Tuple;
import com.veg.vespark.catalyst.storage.common.Type;
import com.veg.vespark.catalyst.storage.field.*;


import java.util.Objects;

public class Literal extends LeafExpression {
    Tuple value;


    public Literal(String value, Type dataType) {
        String filedName;
        Field field;
        switch (dataType) {
            case INT_TYPE:
                filedName = "IntLiteral";
                field = new IntField(Integer.parseInt(value));
                break;
            case LONG_TYPE:
                filedName = "LongLiteral";
                field = new LongField(Long.parseLong(value));
                break;
            case STRING_TYPE:
                filedName = "StringLiteral";
                field = new StringField(value, value.length());
                break;
            case BOOLEAN_TYPE:
                filedName = "BooleanLiteral";
                field = new BooleanField(Boolean.parseBoolean(value));
                break;
            default:
                throw new RuntimeException("Unsupported literal type!");
        }
        this.value = new Tuple(dataType,filedName,field);
    }

    @Override
    public Tuple eval(Tuple input) {
        return value;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Literal literal = (Literal) o;
        return Objects.equals(value, literal.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Literal{" +
                "value=" + value +
                '}';
    }
}
