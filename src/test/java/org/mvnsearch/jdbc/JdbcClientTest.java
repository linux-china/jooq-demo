package org.mvnsearch.jdbc;

import org.junit.Test;
import org.mvnsearch.DatabaseBaseTestCase;
import org.unitils.spring.annotation.SpringBean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * jdbc client test
 *
 * @author linux_china
 */
public class JdbcClientTest extends DatabaseBaseTestCase {
    @SpringBean("dataSource")
    private DataSource dataSource;

    @Test
    public void testSelect() throws Exception {
        Connection conn = dataSource.getConnection();
        Statement smt = conn.createStatement();
        ResultSet rs = smt.executeQuery("SELECT * FROM language");
        while (rs.next()) {
            System.out.println(rs.getString("id"));
        }
        rs.close();
        smt.close();
        conn.close();
    }
}
