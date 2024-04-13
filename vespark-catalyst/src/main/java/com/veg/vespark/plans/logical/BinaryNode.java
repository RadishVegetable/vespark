package com.veg.vespark.plans.logical;

import com.veg.vespark.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class BinaryNode extends LogicalPlan{
    private LogicalPlan left;
    private LogicalPlan right;

    @Override
    public List<? extends TreeNode> getChildren() {
        return Arrays.asList(left,right);
    }
}
