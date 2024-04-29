package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.field.BooleanField;
import com.veg.vespark.catalyst.storage.Predicate;
import com.veg.vespark.catalyst.storage.Tuple;
import com.veg.vespark.catalyst.storage.common.Type;

public class GreaterThanOrEqual extends BinaryExpression {
    public GreaterThanOrEqual(Expression left, Expression right) {
        super.left = left;
        super.right = right;
    }

    @Override
    protected Tuple nullSafeEval(Tuple value1, Tuple value2) {
        Type type1 = value1.getTupleDesc().getFieldType(0);
        Type type2 = value2.getTupleDesc().getFieldType(0);
        boolean compare = false;
        if (type1.equals(type2)) {
            compare = value1.getField(0).compare(Predicate.Op.GREATER_THAN_OR_EQ, value2.getField(0));
        } else {
            // TODO 考虑数据类型转换
//            throw new RuntimeException("Data types should be consistent!");
        }
        return Tuple.getBooleanInstance(compare);
    }
}
