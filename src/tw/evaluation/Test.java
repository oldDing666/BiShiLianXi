package tw.evaluation;

import tw.evaluation.commands.CommandExecutor;
import tw.evaluation.commands.CommandResponse;
import tw.evaluation.database.DatabaseConfiguration;
import tw.evaluation.database.DatabaseConnectionProvider;
import tw.evaluation.repository.CounterRepository;

/**
 * @author: afuya
 * @program: BiShiLianXi
 * @date: 2021/7/7 3:49 下午
 */
public class Test {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor(new CounterRepository(
                () -> DatabaseConnectionProvider.createConnection(new DatabaseConfiguration("", "", "", ""))
        ));

        CommandResponse response = executor.execute("create goodName");

    }
}
