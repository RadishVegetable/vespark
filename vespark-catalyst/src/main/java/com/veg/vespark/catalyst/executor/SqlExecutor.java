package com.veg.vespark.catalyst.executor;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;
import com.veg.vespark.catalyst.parser.SqlParser;
import com.veg.vespark.catalyst.planning.QueryPlanner;
import com.veg.vespark.catalyst.plans.logical.LogicalPlan;
import com.veg.vespark.catalyst.plans.physical.SparkPlan;
import com.veg.vespark.catalyst.storage.Tuple;
import com.veg.vespark.catalyst.storage.common.Catalog;
import com.veg.vespark.catalyst.storage.common.Database;

import java.util.ArrayList;
import java.util.List;

/**
 * sql执行器
 */
public class SqlExecutor {

    private SqlParser sqlParser;
    private QueryPlanner queryPlanner;


    public List<Tuple> execute(String sql) {
        sqlParser = new SqlParser();
        queryPlanner = new QueryPlanner();

        LogicalPlan logicalPlan = sqlParser.parsePlan(sql);
        SparkPlan sparkPlan = queryPlanner.plan(logicalPlan);

        List<Tuple> result = doExecute(sparkPlan);
        System.out.println("ok");
        return result;
    }

    private List<Tuple> doExecute(SparkPlan sparkPlan) {
        try {
            List<Tuple> result = new ArrayList<>();
            Tuple tuple = sparkPlan.execute();
            while(tuple != null) {
                result.add(tuple);
                tuple = sparkPlan.execute();
            }
            return result;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
