package com.veg.vespark.catalyst.planning;

import com.veg.vespark.catalyst.expressions.*;
import com.veg.vespark.catalyst.plans.logical.Filter;
import com.veg.vespark.catalyst.plans.logical.LogicalPlan;
import com.veg.vespark.catalyst.plans.logical.Project;
import com.veg.vespark.catalyst.plans.logical.Relation;
import com.veg.vespark.catalyst.plans.physical.FileScanExec;
import com.veg.vespark.catalyst.plans.physical.FilterExec;
import com.veg.vespark.catalyst.plans.physical.ProjectExec;
import com.veg.vespark.catalyst.plans.physical.SparkPlan;
import sun.reflect.FieldAccessor;

import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.Adler32;

public class QueryPlanner {

    public SparkPlan plan(LogicalPlan plan) {
        CollectedAttribute ca = collectProjectsAndFilters(plan);
        Relation relation = (Relation)ca.other;

        FileScanExec scan = new FileScanExec(relation.tableName());
        if(!ca.filters.isEmpty()) {
            Iterator<Expression> iterator = ca.filters.iterator();
            Expression andFilter = iterator.next();
            while(iterator.hasNext()) {
                andFilter = new And(andFilter,iterator.next());
            }
            FilterExec filterExec = new FilterExec(andFilter, scan);
            return new ProjectExec(ca.fields,filterExec);
        } else {
            return new ProjectExec(ca.fields,scan);
        }
    }

    public CollectedAttribute collectProjectsAndFilters(LogicalPlan plan) {

        if (plan instanceof Project) {
            Project plan1 = (Project) plan;
            CollectedAttribute ca = collectProjectsAndFilters(plan1.getChild());
            List<NamedExpression> substitutedFields = (plan1).getProjectList().stream().map(expr -> (NamedExpression) substitute(ca.aliases, expr)).collect(Collectors.toList());
            return new CollectedAttribute(substitutedFields,ca.getFilters(),ca.getOther(),collectAliases(substitutedFields));
        } else if (plan instanceof Filter) {
            Filter plan1 = (Filter) plan;
            CollectedAttribute ca = collectProjectsAndFilters(plan1.getChild());
            Expression substitutedCondition = substitute(ca.aliases, plan1.getCondition());
            // splitConjunctivePredicates方法是拆分And的两个cond，作为一个list输出，暂不实现
            List<Expression> filters = new ArrayList<>(ca.filters);
            filters.add(substitutedCondition);
            return new CollectedAttribute(ca.fields,filters,ca.other,ca.aliases);
        } else {
            return new CollectedAttribute(null,new ArrayList<>(), plan, new HashMap<>());
        }
    }

    private Map<Attribute, Expression> collectAliases(List<NamedExpression> fields) {
        Map<Attribute, Expression> map = new HashMap<>();
        for(NamedExpression field : fields) {
            if (field instanceof Alias) {
                Alias alias = (Alias) field;
                map.put(alias.toAttribute(), alias.getChild());
            }
        }
        return map;
    }

    /**
     * TODO 处理alias,暂时不用alias
     *
     *
     * @param aliases
     * @param expr
     * @return
     */
    private Expression substitute(Map<Attribute, Expression> aliases, Expression expr) {
        return expr;
    }

}
