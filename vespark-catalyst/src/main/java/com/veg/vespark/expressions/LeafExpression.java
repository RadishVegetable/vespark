package com.veg.vespark.expressions;

import com.veg.vespark.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class LeafExpression extends Expression{
    @Override
    public List<? extends TreeNode> getChildren() {
        return new ArrayList<Expression>();
    }
}
