package zero.programmer.singleton;

import zero.programmer.object_pool.DatabasePool;

public class OrderService {
    public void save(String orderId){

        Connection connection = DatabasePool.getConnection();
        connection.sql("INSERT INTO ORDER...");
        DatabasePool.close(connection);

    }
}
