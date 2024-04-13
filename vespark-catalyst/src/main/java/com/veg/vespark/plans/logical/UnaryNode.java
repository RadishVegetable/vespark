package com.veg.vespark.plans.logical;

import com.veg.vespark.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class UnaryNode extends LogicalPlan{
    protected LogicalPlan child;

    @Override
    public List<? extends TreeNode> getChildren() {
        return Arrays.asList(child);
    }
}
