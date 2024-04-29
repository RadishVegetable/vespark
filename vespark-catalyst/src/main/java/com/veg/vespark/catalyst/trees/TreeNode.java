package com.veg.vespark.catalyst.trees;

import java.util.List;
import java.util.function.Function;

public abstract class TreeNode<BaseType extends TreeNode<BaseType>> {

    public abstract List<? extends BaseType> getChildren();

    public BaseType transform(Function<BaseType,BaseType> rule) {
        return transformDown(rule);
    }

    private BaseType transformDown(Function<BaseType, BaseType> rule) {
       return null;

    }

    private BaseType mapChildren(Function<BaseType, BaseType> f) {
        return null;
    }
}
