package miu.edu.northeastenbank.camsys.camsysspringbootapi.service;

import miu.edu.northeastenbank.camsys.camsysspringbootapi.entity.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);
    List<Account> getAllAccount();

    List<Account> getAllDepositAccountByBalanceDesc();
    List<Account> getAllPrimeAccounts();
}
