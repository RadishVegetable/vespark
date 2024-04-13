package com.veg.vespark.expressions;

import com.veg.vespark.trees.TreeNode;

import java.util.*;

public abstract class BinaryExpression extends Expression{
    private Expression left;
    private Expression right;

    @Override
    public Object eval(Object input) {
        Object value1 = left.eval(input);
        if (value1 == null) {
            return null;
        } else {
            Object value2 = right.eval(input);
            if (value2 == null) {
                return null;
            } else {
                return nullSafeEval(value1,value2);
            }
        }
    }

    protected abstract Object nullSafeEval(Object value1, Object value2);

    @Override
    public List<? extends TreeNode> getChildren() {
        return Arrays.asList(left,right);
    }
}
