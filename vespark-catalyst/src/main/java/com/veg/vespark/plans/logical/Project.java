package com.veg.vespark.plans.logical;

import com.veg.vespark.expressions.Expression;

import java.util.List;

public class Project extends UnaryNode{
    private final List<Expression> projectList;


    public Project(List<Expression> projectList, LogicalPlan child) {
        this.projectList = projectList;
        super.child = child;
    }
}
