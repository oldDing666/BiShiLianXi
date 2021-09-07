/*
 * This file CANNOT be modified.
 */

package tw.evaluation.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectionProvider {
    private DatabaseConnectionProvider() {
    }

    public static Connection createConnection(DatabaseConfiguration configuration) {
        try {
            Class.forName(configuration.getDriver());
            return DriverManager.getConnection(
                configuration.getUri(), configuration.getUsername(), configuration.getPassword());
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid configuration", e);
        }
    }
}
