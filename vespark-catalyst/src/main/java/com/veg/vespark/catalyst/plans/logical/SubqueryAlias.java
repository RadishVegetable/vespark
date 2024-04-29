package com.veg.vespark.catalyst.plans.logical;

public class SubqueryAlias extends UnaryNode{
    private final AliasIdentifier name;

    public SubqueryAlias(AliasIdentifier name, LogicalPlan child) {
        this.name = name;
        super.child = child;
    }

    public String alias() {
        return name.getTable();
    }
}
