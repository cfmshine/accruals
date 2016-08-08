package com.cfmshine.test;

import com.cfmshine.accuals.utils.ApplicationContextUtils;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.Test;

public class DataSourceTest {

    @Test
    public void DataSourceConnection() throws SQLException {
        DataSource dataSource = ApplicationContextUtils.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }

}
