package org.mvnsearch.jooq;

import org.junit.Assert;
import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.database.annotations.TestDataSource;

import javax.sql.DataSource;

/**
 * unitils check test
 *
 * @author linux_china
 */
public class UnitilsCheckTest extends UnitilsJUnit4 {

    @TestDataSource
    private DataSource dataSource;

    @Test
    public void testDatabaseInfo() {
        Assert.assertNotNull(dataSource);
    }
}
