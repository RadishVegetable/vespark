package com.veg.vespark.catalyst.plans.physical;

import com.veg.vespark.catalyst.expressions.Expression;
import com.veg.vespark.catalyst.storage.field.BooleanField;
import com.veg.vespark.catalyst.storage.field.Field;
import com.veg.vespark.catalyst.storage.Tuple;

import java.util.List;

public class FilterExec extends UnaryExecNode {

    Expression condition;



    public FilterExec(Expression condition, SparkPlan child) {
        this.condition = condition;
        super.child = child;

    }

    @Override
    protected Tuple doExecute() {
        while (true) {
            Tuple tuple = child.execute();
            if (tuple != null) {
                Field field = condition.eval(tuple).getField(0);
                if (field instanceof BooleanField && ((BooleanField) field).getValue()) {
                    return tuple;
                }
            } else {
                return null;
            }
        }

    }
}
