package com.qaisarabbas.readwrite.config;

import com.qaisarabbas.readwrite.util.DataSourceType;

public class DynamicDataSourceHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static void putDataSource(DataSourceType dataSourceType) {
        holder.set(dataSourceType.getType());
    }

    public static String getDataSource() {
        return holder.get();
    }

    public static void clearDataSource() {
        holder.remove();
    }
}
