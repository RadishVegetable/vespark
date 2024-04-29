package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.Tuple;

public class Not extends UnaryExpression{
    public Not(Expression child) {
        super.child = child;
    }

    @Override
    protected Tuple nullSafeEval(Tuple input) {
        return null;
    }
}
