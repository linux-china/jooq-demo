package org.mvnsearch;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.xml.FlatDtdDataSet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.io.FileOutputStream;

public class DataBaseTest extends JooqBaseTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void generateDTD() throws Exception {
        IDatabaseConnection connection = new DatabaseConnection(dataSource.getConnection());
        FlatDtdDataSet.write(connection.createDataSet(), new FileOutputStream("target/database.dtd"));
    }
}
