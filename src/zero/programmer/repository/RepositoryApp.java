package zero.programmer.repository;

import zero.programmer.object_pool.DatabasePool;

public class RepositoryApp {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId("0001");
        product1.setName("Mac book pro");
        product1.setPrice(10000000L);

        ProductRepository repository = new ProductRepository();
        repository.insert(product1);

        product1.setPrice(5000000L);
        repository.update(product1);

        repository.delete(product1.getId());
        repository.selectAll();

    }
}
