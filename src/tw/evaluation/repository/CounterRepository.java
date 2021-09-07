/*
 * You can ONLY modify code within the <-start- and --end-> region.
 */

package tw.evaluation.repository;

import java.sql.Connection;
import java.util.function.Supplier;

public class CounterRepository {
    public CounterRepository(Supplier<Connection> connectionProvider) {
        // TODO: Please implement this method.
        // <-start-
        this.connection = (Connection) connectionProvider;
        // --end-->
    }

    // TODO: You can add members to this class.
    // <-start-
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    // --end->
}
