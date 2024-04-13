package com.veg.vespark.plans.physical;

import com.veg.vespark.plans.QueryPlan;

public abstract class SparkPlan extends QueryPlan {

    public Object execute() {
        return doExecute();
    }

    protected abstract Object doExecute();
}
