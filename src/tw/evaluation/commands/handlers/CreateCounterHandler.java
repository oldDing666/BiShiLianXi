/*
 * You can ONLY modify code within the <-start- and --end-> region.
 */

package tw.evaluation.commands.handlers;

import tw.evaluation.commands.CommandResponse;
import tw.evaluation.repository.CounterRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class CreateCounterHandler implements CommandHandler {
    private final CounterRepository repository;

    public CreateCounterHandler(CounterRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean isSupport(String commandName) {
        return commandName.equals("create");
    }

    @Override
    public CommandResponse handle(String[] commandTokens) throws SQLException {
        // TODO: Please implement this method.
        // <-start-


        String sql = "insert into counter values(null, ?,null) ";

        Connection connection = repository.getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, commandTokens[1]);
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        int id = 0;
        String name = "";
        int value = 0;
        if (rs.next()) {
            id = rs.getInt(1);
            name = rs.getString(2);
            value = rs.getInt(3);
        }

        String message = "Created: counter \"" + name + "\" created. Id=" + id;
        return new CommandResponse(message, true);
        // --end->
    }
}
