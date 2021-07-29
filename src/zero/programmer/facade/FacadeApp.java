package zero.programmer.facade;

import zero.programmer.facade.entity.Account;
import zero.programmer.facade.entity.Address;
import zero.programmer.facade.entity.Customer;
import zero.programmer.facade.facade.AccountService;
import zero.programmer.facade.facade.CustomerFacade;
import zero.programmer.facade.repository.AccountRepository;
import zero.programmer.facade.repository.AddressRepository;
import zero.programmer.facade.repository.CustomerRepository;

public class FacadeApp {
    public static void main(String[] args) {

        Customer customer = new Customer("01", "Ucup");

        Address address1 = new Address("01", "jakarta", "indonesia");
        Address address2 = new Address("02", "bandung", "indonesia");

        customer.getAddresses().add(address1);
        customer.getAddresses().add(address2);

        CustomerFacade customerFacade = new CustomerFacade();
        customerFacade.saveCustomer(customer);

        //==================================

        AccountService accountService = new AccountService();

        // transfer 1.000.000 from account1 to account 2
        accountService.transfer("001", "002", 1000000L);

        // transfer 200.000 from account3 to account 4
        accountService.transfer("003", "004", 200000L);

    }
}
