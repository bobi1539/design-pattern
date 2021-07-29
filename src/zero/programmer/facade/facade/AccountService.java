package zero.programmer.facade.facade;

import zero.programmer.facade.entity.Account;
import zero.programmer.facade.repository.AccountRepository;

public class AccountService {

    private AccountRepository accountRepository = new AccountRepository();

    public void transfer(String fromAccountNo, String toAccountNo, Long amount){

        Account account1 = accountRepository.findById(fromAccountNo);
        Account account2 = accountRepository.findById(toAccountNo);

        account1.setBalance(account1.getBalance() - amount);
        account2.setBalance(account2.getBalance() + amount);

        accountRepository.update(account1);
        accountRepository.update(account2);

        System.out.println("Transfer berhasil");

    }

}
