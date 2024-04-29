package com.veg.vespark.catalyst.parser;

import com.veg.vespark.catalyst.executor.SqlExecutor;
import com.veg.vespark.catalyst.storage.*;
import com.veg.vespark.catalyst.storage.field.IntField;
import com.veg.vespark.catalyst.storage.field.StringField;
import org.junit.Test;
import com.veg.vespark.catalyst.storage.common.Database;
import com.veg.vespark.catalyst.storage.common.Type;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqlParserTest {

    @Test
    public void selectTest() {
        try {
            // create
            Type[] types = new Type[]{Type.INT_TYPE, Type.STRING_TYPE, Type.INT_TYPE};
            String[] names = new String[]{"id", "name", "age"};
            TupleDesc td = new TupleDesc(types, names);
            File file = new File("data_file.dat");
            if (file.exists()) {
                file.delete();
                file.createNewFile();
            }
            HeapFile table1 = new HeapFile(new File("src/test/resources/data_file.dat"), td);
            Database.getCatalog().addTable(table1, "t1");
            // insert
            TransactionId transactionId = new TransactionId();
            int tableId = Database.getCatalog().getTableId("t1");

            List<Tuple> tuples = getTestTuple(td);
            for (Tuple tp : tuples) {
                Database.getBufferPool().insertTuple(transactionId,tableId,tp);
            }
            // select

            String sql = "select t1.id, t1.name from t1 where t1.age >= 12";
            SqlExecutor sqlExecutor = new SqlExecutor();
            List<Tuple> result = sqlExecutor.execute(sql);
            for(Tuple res : result) {
                System.out.println(res);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private List<Tuple> getTestTuple(TupleDesc td) {
        /**
         *  TODO null值的处理，目前不能接收null
         */
        List<Integer> ids = Arrays.asList(1, 2, 3);
        List<String> names = Arrays.asList("Tom", "John", "Marin");
        List<Integer> ages = Arrays.asList(1, 18, 31);

        List<Tuple> tuples = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            Tuple tuple = new Tuple(td);
            tuple.setField(0, new IntField(ids.get(i)));
            tuple.setField(1, new StringField(names.get(i), names.get(i).length()));
            tuple.setField(2, new IntField(ages.get(i)));
            tuples.add(tuple);
        }
        return tuples;
    }

    @Test
    public void test() {

    }
}
