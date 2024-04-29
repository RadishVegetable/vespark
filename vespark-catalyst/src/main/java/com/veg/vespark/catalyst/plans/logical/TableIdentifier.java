package com.veg.vespark.catalyst.plans.logical;

import java.util.Optional;

public class TableIdentifier extends IdentifierWithDatabase{

    public TableIdentifier(String table, Optional<String> database) {
        super(table, database);
    }
}
