package com.veg.vespark.catalyst.plans.physical;

import com.veg.vespark.catalyst.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class LeafExecNode extends SparkPlan{

    @Override
    public List<? extends SparkPlan> getChildren() {
        return new ArrayList<>();
    }
}
