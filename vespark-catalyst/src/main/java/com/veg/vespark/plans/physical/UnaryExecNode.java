package com.veg.vespark.plans.physical;

import com.veg.vespark.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class UnaryExecNode extends SparkPlan{
    private SparkPlan child;

    @Override
    public List<? extends TreeNode> getChildren() {
        return Arrays.asList(child);
    }
}
