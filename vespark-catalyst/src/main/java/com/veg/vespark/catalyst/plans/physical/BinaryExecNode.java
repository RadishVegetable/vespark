package com.veg.vespark.catalyst.plans.physical;

import com.veg.vespark.catalyst.trees.TreeNode;

import java.util.Arrays;
import java.util.List;

public abstract class BinaryExecNode extends SparkPlan{
    private SparkPlan left;
    private SparkPlan right;

    @Override
    public List<? extends SparkPlan> getChildren() {
        return Arrays.asList(left,right);
    }
}
