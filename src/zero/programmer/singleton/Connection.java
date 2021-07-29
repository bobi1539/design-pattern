package zero.programmer.singleton;

import java.util.ArrayList;
import java.util.List;

public class Connection {
    private String host;
    private String username;
    private String password;

    public Connection(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void sql(String querySql){
        System.out.println("query sql");
    }

    public void sql(String querySql, String id, String name, Long price){
        System.out.println("query sql");
    }

    public List<Object[]> select(String query){
        return new ArrayList<>();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
