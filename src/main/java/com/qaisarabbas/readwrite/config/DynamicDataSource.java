package com.qaisarabbas.readwrite.config;

import com.qaisarabbas.readwrite.util.DataSourceType;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected String determineCurrentLookupKey() {
        if (DynamicDataSourceHolder.getDataSource() != null) {
            return DynamicDataSourceHolder.getDataSource();
        }
        return DataSourceType.MASTER.getType();

    }
}
