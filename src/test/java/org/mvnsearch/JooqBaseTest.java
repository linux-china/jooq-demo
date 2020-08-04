package org.mvnsearch;

import com.github.database.rider.spring.api.DBRider;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = JooqAppServer.class)
@ActiveProfiles("test")
@DBRider
public abstract class JooqBaseTest {
}
