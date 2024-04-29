package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.Tuple;

public class And extends BinaryExpression{
    public And(Expression left, Expression right) {
        super.left = left;
        super.right = right;
    }

    @Override
    public Tuple eval(Tuple input) {
        return null;
    }

}
