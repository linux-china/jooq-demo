package org.mvnsearch.jooq;

import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.ConfigureProfile;
import org.unitils.spring.annotation.SpringApplicationContext;

/**
 * jooq base test case
 *
 * @author linux_china
 */
@SpringApplicationContext({"/appContext-jooq-unit.xml"})
@ConfigureProfile("unit")
public abstract class JooqBaseTestCase extends UnitilsJUnit4 {
}
