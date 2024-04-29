package com.veg.vespark.catalyst.plans.logical;

import com.veg.vespark.catalyst.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class BinaryNode extends LogicalPlan{
    private LogicalPlan left;
    private LogicalPlan right;

    @Override
    public List<? extends LogicalPlan> getChildren() {
        return Arrays.asList(left,right);
    }
}
