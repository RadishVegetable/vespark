package com.veg.vespark.catalyst.planning;

import com.veg.vespark.catalyst.expressions.Attribute;
import com.veg.vespark.catalyst.expressions.Expression;
import com.veg.vespark.catalyst.expressions.NamedExpression;
import com.veg.vespark.catalyst.plans.logical.LogicalPlan;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * 用于collectProjectsAndFilters的返回值
 * (Option[Seq[NamedExpression]], Seq[Expression], LogicalPlan, Map[Attribute, Expression])
 */
public class CollectedAttribute {
    List<NamedExpression> fields;

    List<Expression> filters;

    LogicalPlan other;

    Map<Attribute, Expression> aliases;

    public CollectedAttribute(List<NamedExpression> fields, List<Expression> filters, LogicalPlan other, Map<Attribute, Expression> aliases) {
        this.fields = fields;
        this.filters = filters;
        this.other = other;
        this.aliases = aliases;
    }

    public List<NamedExpression> getFields() {
        return fields;
    }

    public void setFields(List<NamedExpression> fields) {
        this.fields = fields;
    }

    public List<Expression> getFilters() {
        return filters;
    }

    public void setFilters(List<Expression> filters) {
        this.filters = filters;
    }

    public LogicalPlan getOther() {
        return other;
    }

    public void setOther(LogicalPlan other) {
        this.other = other;
    }

    public Map<Attribute, Expression> getAliases() {
        return aliases;
    }

    public void setAliases(Map<Attribute, Expression> aliases) {
        this.aliases = aliases;
    }
}
