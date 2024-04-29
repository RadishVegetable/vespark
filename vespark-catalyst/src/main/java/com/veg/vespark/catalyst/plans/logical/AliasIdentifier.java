package com.veg.vespark.catalyst.plans.logical;

import java.util.Optional;

public class AliasIdentifier extends IdentifierWithDatabase{
    public AliasIdentifier(String table) {
        super(table, Optional.empty());
    }
}
