package com.veg.vespark.catalyst.plans.physical;

import com.veg.vespark.catalyst.expressions.Expression;
import com.veg.vespark.catalyst.expressions.NamedExpression;
import com.veg.vespark.catalyst.storage.field.Field;
import com.veg.vespark.catalyst.storage.Tuple;
import com.veg.vespark.catalyst.storage.TupleDesc;
import com.veg.vespark.catalyst.storage.common.Type;

import java.util.List;

public class ProjectExec extends UnaryExecNode{

    List<NamedExpression> projectList;

    public ProjectExec(List<NamedExpression> projectList, SparkPlan child) {
        this.projectList = projectList;
        super.child = child;
    }

    @Override
    protected Tuple doExecute() {
        Tuple tuple = child.execute();
        if(tuple != null) {
            return tupleFromProjectList(tuple);
        }
        return null;
    }

    private Tuple tupleFromProjectList(Tuple tuple) {
        Type[] typeAr = new Type[projectList.size()];
        String[] fieldAr = new String[projectList.size()];
        Field[] fieldValues = new Field[projectList.size()];


        for(int i = 0; i < projectList.size(); i++) {
            Expression expression = (Expression) projectList.get(i);
            Tuple subTuple = (Tuple) expression.eval(tuple);
            typeAr[i] = subTuple.getTupleDesc().getFieldType(0);
            fieldAr[i] = subTuple.getTupleDesc().getFieldName(0);
            fieldValues[i] = subTuple.getField(0);
        }
        Tuple result = new Tuple(new TupleDesc(typeAr, fieldAr));
        for(int i = 0; i < projectList.size(); i++) {
            result.setField(i,fieldValues[i]);
        }
        return result;
    }
}
