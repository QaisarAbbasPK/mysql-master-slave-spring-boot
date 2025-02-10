package com.qaisarabbas.readwrite.annotations;

import com.qaisarabbas.readwrite.util.DataSourceType;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
@Inherited
public @interface DataSource {

    DataSourceType value() default DataSourceType.MASTER;
}
