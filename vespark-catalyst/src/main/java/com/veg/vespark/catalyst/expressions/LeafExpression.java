package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class LeafExpression extends Expression{
    @Override
    public List<? extends Expression> getChildren() {
        return new ArrayList<Expression>();
    }
}
