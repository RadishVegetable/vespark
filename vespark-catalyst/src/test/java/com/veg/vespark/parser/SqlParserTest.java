package com.veg.vespark.parser;

import com.veg.vespark.plans.logical.LogicalPlan;
import org.junit.Test;

public class SqlParserTest {

    @Test
    public void testSelect() {
        String sql = "select name from a where age>10";
        SqlParser sqlParser = new SqlParser();
        LogicalPlan logicalPlan = sqlParser.parsePlan(sql);

    }
}
