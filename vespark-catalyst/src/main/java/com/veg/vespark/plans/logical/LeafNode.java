package com.veg.vespark.plans.logical;

import com.veg.vespark.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class LeafNode extends LogicalPlan{

    @Override
    public List<? extends TreeNode> getChildren() {
        return new ArrayList<>();
    }
}
