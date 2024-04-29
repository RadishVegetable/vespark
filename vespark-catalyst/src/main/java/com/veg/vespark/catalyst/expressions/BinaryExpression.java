package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.Tuple;

import java.util.*;

public abstract class BinaryExpression extends Expression{
    protected Expression left;
    protected Expression right;

    @Override
    public Tuple eval(Tuple input) {
        Tuple value1 = left.eval(input);
        if (value1 == null) {
            return null;
        } else {
            Tuple value2 = right.eval(input);
            if (value2 == null) {
                return null;
            } else {
                return nullSafeEval(value1,value2);
            }
        }
    }

    protected Tuple nullSafeEval(Tuple value1, Tuple value2) {
        throw new RuntimeException("BinaryExpressions must override either eval or nullSafeEval");
    }

    @Override
    public List<? extends Expression> getChildren() {
        return Arrays.asList(left,right);
    }
}
