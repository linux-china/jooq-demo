package org.mvnsearch;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.core.connection.RiderDataSource;
import com.github.database.rider.spring.api.DBRider;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = JooqAppServer.class)
@ActiveProfiles("test")
@DBRider
@DBUnit(schema = "jooq", disableSequenceFiltering = true, expectedDbType = RiderDataSource.DBType.MYSQL)
public abstract class JooqBaseTest {
}
