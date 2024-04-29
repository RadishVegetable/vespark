package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.Tuple;

public class LessThanOrEqual extends BinaryExpression{
    public LessThanOrEqual(Expression left, Expression right) {
        super.left = left;
        super.right = right;
    }


    @Override
    protected Tuple nullSafeEval(Tuple value1, Tuple value2) {
        return null;
    }
}
