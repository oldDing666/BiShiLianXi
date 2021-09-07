/*
 * This file CANNOT be modified.
 */

package tw.evaluation;


import tw.evaluation.commands.CommandExecutor;
import tw.evaluation.database.DatabaseConfiguration;
import tw.evaluation.database.DatabaseConnectionProvider;
import tw.evaluation.database.DatabaseMigration;
import tw.evaluation.repository.CounterRepository;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) throws Exception {
        final DatabaseConfiguration configuration = new DatabaseConfiguration(
                "jdbc:h2:mem:prodDB;MODE=MYSQL;", "sa", "p@ssword", "org.h2.Driver"
        );

        // Since we are using in-memory database for simulation purpose. So we
        // will hold a connection so that the database will not be dropped as
        // soon as the user created connection is closed.
        try (Connection ignored = DatabaseConnectionProvider.createConnection(configuration)) {
            DatabaseMigration.migrate(configuration);
            CounterRepository repository = new CounterRepository(() -> DatabaseConnectionProvider.createConnection(configuration));
            CommandExecutor executor = new CommandExecutor(repository);
            CounterApplication application = new CounterApplication(executor);
            application.run(System.in, System.out); //NOSONAR
        }
    }
}
