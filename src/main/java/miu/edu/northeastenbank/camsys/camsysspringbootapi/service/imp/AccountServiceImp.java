package miu.edu.northeastenbank.camsys.camsysspringbootapi.service.imp;

import miu.edu.northeastenbank.camsys.camsysspringbootapi.entity.Account;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.repository.AccountRepository;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public List<Account> getAllDepositAccountByBalanceDesc() {
        return accountRepository.getAllDepositAccountsByBalanceSort();
    }

    @Override
    public List<Account> getAllPrimeAccounts() {
        return accountRepository.getAllPrimeAccounts();
    }
}
