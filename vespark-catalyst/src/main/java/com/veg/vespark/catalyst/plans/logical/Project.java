package com.veg.vespark.catalyst.plans.logical;

import com.veg.vespark.catalyst.expressions.Expression;

import java.util.List;

public class Project extends UnaryNode{
    private final List<Expression> projectList;


    public Project(List<Expression> projectList, LogicalPlan child) {
        this.projectList = projectList;
        super.child = child;
    }

    public List<Expression> getProjectList() {
        return projectList;
    }
}
