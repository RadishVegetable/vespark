package com.veg.vespark.catalyst.plans.physical;

import com.veg.vespark.catalyst.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class UnaryExecNode extends SparkPlan{
    protected SparkPlan child;

    @Override
    public List<? extends SparkPlan> getChildren() {
        return Arrays.asList(child);
    }

    public SparkPlan getChild() {
        return child;
    }
}
