package com.veg.vespark.catalyst.plans.logical;

import java.util.Optional;

public class IdentifierWithDatabase {
    private final String table;
    private final Optional<String> database;

    public IdentifierWithDatabase(String table, Optional<String> database) {
        this.table = table;
        this.database = database;
    }

    public String unquotedString() {
        if (database.isPresent()) {
            return database.get() + "." + table;
        } else {
            return table;
        }
    }

    public String getTable() {
        return table;
    }

    public String getDatabase() {
        if (database.isPresent())
            return database.get();
        else
            return "";
    }
}
