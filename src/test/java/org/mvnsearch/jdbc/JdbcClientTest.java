package org.mvnsearch.jdbc;

import org.junit.jupiter.api.Test;
import org.mvnsearch.JooqBaseTest;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * jdbc client test
 *
 * @author linux_china
 */
public class JdbcClientTest extends JooqBaseTest {
    @Autowired
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
