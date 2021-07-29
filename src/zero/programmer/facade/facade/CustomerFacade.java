package zero.programmer.facade.facade;

import zero.programmer.facade.entity.Address;
import zero.programmer.facade.entity.Customer;
import zero.programmer.facade.repository.AddressRepository;
import zero.programmer.facade.repository.CustomerRepository;

public class CustomerFacade {
    private CustomerRepository customerRepository = new CustomerRepository();
    private AddressRepository addressRepository = new AddressRepository();

    public void saveCustomer(Customer customer){
        customerRepository.save(customer);

        for (Address address : customer.getAddresses()){
            addressRepository.save(address);
        }
    }
}
