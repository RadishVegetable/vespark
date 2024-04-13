package com.veg.vespark.expressions;

import com.veg.vespark.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class UnaryExpression extends Expression{
    private Expression child;

    @Override
    public Object eval(Object input) {
        Object value = child.eval(input);
        if (value == null) {
            return null;
        } else {
            return nullSafeEval(value);
        }
    }

    protected abstract Object nullSafeEval(Object input);

    @Override
    public List<? extends TreeNode> getChildren() {
        return Arrays.asList(child);
    }
}
