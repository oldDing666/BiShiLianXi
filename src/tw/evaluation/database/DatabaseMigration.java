/*
 * This file CANNOT be modified.
 */

package tw.evaluation.database;


import org.flywaydb.core.Flyway;

public class DatabaseMigration {
    private DatabaseMigration() {
    }

    public static void migrate(DatabaseConfiguration configuration) {
        Flyway migration = Flyway.configure()
                .dataSource(configuration.getUri(), configuration.getUsername(), configuration.getPassword()).load();
        migration.migrate();
    }
}
