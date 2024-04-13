package com.veg.vespark.expressions;

import com.veg.vespark.trees.TreeNode;

public abstract class Expression extends TreeNode {
    public abstract Object eval(Object input);
}
