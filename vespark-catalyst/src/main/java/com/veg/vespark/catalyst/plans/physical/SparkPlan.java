package com.veg.vespark.catalyst.plans.physical;

import com.veg.vespark.catalyst.plans.QueryPlan;
import com.veg.vespark.catalyst.storage.Tuple;

public abstract class SparkPlan extends QueryPlan<SparkPlan> {

    public Tuple execute() {
        return doExecute();
    }

    protected abstract Tuple doExecute();
}
