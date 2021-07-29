package zero.programmer.singleton;

import zero.programmer.object_pool.DatabasePool;

public class OrderDetailService {
    public void save(String orderId, String product){

        Connection connection = DatabasePool.getConnection();
        connection.sql("INSERT INTO ORDER_DETAIL....");
        DatabasePool.close(connection);

    }
}
