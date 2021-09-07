/*
 * This file CANNOT be modified.
 */

package tw.evaluation.database;

public class DatabaseConfiguration {
    private final String uri;
    private final String username;
    private final String password;
    private final String driver;

    public DatabaseConfiguration(String uri, String username, String password, String driver) {
        this.uri = uri;
        this.username = username;
        this.password = password;
        this.driver = driver;
    }

    public String getUri() {
        return uri;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDriver() {
        return driver;
    }
}
