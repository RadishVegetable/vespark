package com.veg.vespark.catalyst.plans.physical;

import com.veg.vespark.catalyst.storage.SeqScan;
import com.veg.vespark.catalyst.storage.TransactionId;
import com.veg.vespark.catalyst.storage.Tuple;
import com.veg.vespark.catalyst.storage.common.Database;
import com.veg.vespark.catalyst.storage.exception.DbException;
import com.veg.vespark.catalyst.storage.exception.TransactionAbortedException;

public class FileScanExec extends LeafExecNode{
    String name;
    int tableId;

    private SeqScan seqScan;

    public FileScanExec(String name) {
        this.name = name;
        TransactionId transactionId = new TransactionId();
        tableId = Database.getCatalog().getTableId(name);
        seqScan = new SeqScan(transactionId,tableId);
        try {
            seqScan.open();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected Tuple doExecute() {
        try {
            if(seqScan.hasNext()){
                return seqScan.next();
            } else {
                seqScan.close();
                return null;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
