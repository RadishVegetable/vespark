package com.veg.vespark.plans.physical;

import com.veg.vespark.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class LeafExecNode extends SparkPlan{

    @Override
    public List<? extends TreeNode> getChildren() {
        return new ArrayList<>();
    }
}
