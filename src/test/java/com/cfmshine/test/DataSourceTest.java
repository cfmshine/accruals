package com.cfmshine.test;

import com.cfmshine.accuals.utils.ApplicationContextUtils;
import java.sql.SQLException;
import javax.sql.DataSource;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

@Log4j
public class DataSourceTest {

    @Test
    public void DataSourceConnection() throws SQLException {
        DataSource dataSource = ApplicationContextUtils.getBean("dataSource");
        System.out.println(dataSource.getConnection());
        log.info(dataSource + "info");
    }

}
