package com.veg.vespark.catalyst.plans.logical;

import com.veg.vespark.catalyst.expressions.Expression;

public class Filter extends UnaryNode{
    private final Expression condition;

    public Filter(Expression condition, LogicalPlan child) {
        this.condition = condition;
        super.child = child;
    }

    public Expression getCondition() {
        return condition;
    }
}
