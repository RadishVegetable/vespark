package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.Tuple;

import com.veg.vespark.catalyst.trees.TreeNode;

public abstract class Expression extends TreeNode<Expression> {
    public abstract Tuple eval(Tuple input);

}
