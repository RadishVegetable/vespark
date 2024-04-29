package com.veg.vespark.catalyst.plans.logical;

import com.veg.vespark.catalyst.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class UnaryNode extends LogicalPlan{


    protected LogicalPlan child;

    @Override
    public List<? extends LogicalPlan> getChildren() {
        return Arrays.asList(child);
    }

    public LogicalPlan getChild() {
        return child;
    }
}
