package com.veg.vespark.catalyst.expressions;

import com.veg.vespark.catalyst.storage.Tuple;

public class Alias extends UnaryExpression implements NamedExpression{

    String name;

    public Alias(String name, Expression child) {
        this.name = name;
        super.child = child;
    }

    @Override
    protected Tuple nullSafeEval(Tuple input) {
        return null;
    }

    @Override
    public Attribute toAttribute() {
        return new AttributeReference(name);
    }

    public String getName() {
        return name;
    }

}
