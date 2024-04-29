package com.veg.vespark.catalyst.plans;

import com.veg.vespark.catalyst.trees.TreeNode;

public abstract class QueryPlan<PlanType extends QueryPlan<PlanType>> extends TreeNode<PlanType> {

}
