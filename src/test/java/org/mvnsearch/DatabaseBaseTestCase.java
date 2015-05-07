package org.mvnsearch;

import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.ConfigureProfile;
import org.unitils.spring.annotation.SpringApplicationContext;

/**
 * database base test case
 *
 * @author linux_china
 */
@SpringApplicationContext({"/appContext-jooq.xml", "/appContext-jooq-unit.xml"})
@ConfigureProfile("unit")
public abstract class DatabaseBaseTestCase extends UnitilsJUnit4 {
}
