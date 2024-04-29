package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.Tuple;

import java.util.Arrays;
import java.util.List;

public abstract class UnaryExpression extends Expression{


    protected Expression child;

    @Override
    public Tuple eval(Tuple input) {
        Tuple value = child.eval(input);
        if (value == null) {
            return null;
        } else {
            return nullSafeEval(value);
        }
    }

    protected abstract Tuple nullSafeEval(Tuple input);

    @Override
    public List<? extends Expression> getChildren() {
        return Arrays.asList(child);
    }
    public Expression getChild() {
        return child;
    }
}
