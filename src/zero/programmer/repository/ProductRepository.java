package zero.programmer.repository;

import zero.programmer.object_pool.DatabasePool;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public void insert(Product product) {
        DatabasePool.getConnection().sql(
                "insert into products(id, name, price) values(?, ?, ?)",
                product.getId(), product.getName(), product.getPrice()
        );
    }

    public void update(Product product){
        DatabasePool.getConnection().sql(
                "update products set name = ?, price = ?, where id = ?",
                product.getId(), product.getName(), product.getPrice()
        );
    }

    public void delete(String id){
        DatabasePool.getConnection().sql(
                "delete from products where id = ?"
        );
    }

    public List<Product> selectAll(){
        List<Object[]> select = DatabasePool.getConnection().select("select * from products");
        List<Product> products = new ArrayList<>();
        for (Object[] objects : select){
            Product product = new Product();
            product.setId((String) objects[0]);
            product.setName((String) objects[0]);
            product.setPrice((Long) objects[0]);
            products.add(product);
        }
        return products;
    }

}
