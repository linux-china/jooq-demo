package org.mvnsearch.spring;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.unitils.spring.annotation.SpringBean;

/**
 * jdbc template test
 *
 * @author linux_china
 */
public class JdbcTemplateTest {
    @SpringBean("jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testSelect() throws Exception {

    }
}
