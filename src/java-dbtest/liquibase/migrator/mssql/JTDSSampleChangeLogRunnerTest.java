package liquibase.migrator.mssql;

import liquibase.migrator.AbstractSimpleChangeLogRunnerTest;

public class JTDSSampleChangeLogRunnerTest extends AbstractSimpleChangeLogRunnerTest {

    public JTDSSampleChangeLogRunnerTest() {
        super("changelogs/mssql.changelog.xml", "jtds-1.2", "net.sourceforge.jtds.jdbc.Driver", "jdbc:jtds:sqlserver://localhost;databaseName=liquibase");
    }
}
