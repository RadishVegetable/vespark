package com.veg.vespark.catalyst.plans.logical;

import com.veg.vespark.catalyst.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public abstract class LeafNode extends LogicalPlan{

    @Override
    public List<? extends LeafNode> getChildren() {
        return new ArrayList<>();
    }
}
