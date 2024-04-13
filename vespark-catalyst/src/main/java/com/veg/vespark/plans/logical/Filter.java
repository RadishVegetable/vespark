package com.veg.vespark.plans.logical;

import com.veg.vespark.expressions.Expression;

public class Filter extends UnaryNode{
    private final Expression condition;

    public Filter(Expression condition, LogicalPlan child) {
        this.condition = condition;
        super.child = child;
    }
}
