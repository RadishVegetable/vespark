package com.veg.vespark.catalyst.plans.logical;

public class Relation extends LeafNode{
    private final TableIdentifier table;

    public Relation(TableIdentifier table) {
        this.table = table;
    }

    public String tableName() {
        return table.unquotedString();
    }
}
