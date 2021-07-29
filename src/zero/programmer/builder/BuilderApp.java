package zero.programmer.builder;

public class BuilderApp {

    public static void main(String[] args){

        CustomerBuilder customer1 = new CustomerBuilder();

        customer1.setId("001");
        customer1.setFirstName("ucup");
        customer1.setLastName("surucup");
        customer1.setEmail("ucup@gmail.com");
        customer1.setPhone("123");

        System.out.println(customer1.getId());

    }

}
