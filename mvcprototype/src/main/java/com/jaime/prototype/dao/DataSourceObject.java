package com.jaime.prototype.dao;

import javax.sql.DataSource;

public class DataSourceObject {

    private DataSource datasource = null;

    public DataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(DataSource datasource) {
        this.datasource = datasource;
    }
    
    
}
