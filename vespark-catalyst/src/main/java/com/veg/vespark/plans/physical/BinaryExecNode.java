package com.veg.vespark.plans.physical;

import com.veg.vespark.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class BinaryExecNode extends SparkPlan{
    private SparkPlan left;
    private SparkPlan right;

    @Override
    public List<? extends TreeNode> getChildren() {
        return Arrays.asList(left,right);
    }
}
