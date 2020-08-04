package org.mvnsearch.spring;

import org.junit.jupiter.api.Test;
import org.mvnsearch.JooqBaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * jdbc template test
 *
 * @author linux_china
 */
public class JdbcTemplateTest extends JooqBaseTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testSelect() throws Exception {
        System.out.println("good");
    }
}
