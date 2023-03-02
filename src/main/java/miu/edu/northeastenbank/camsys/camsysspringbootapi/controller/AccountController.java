package miu.edu.northeastenbank.camsys.camsysspringbootapi.controller;

import jakarta.validation.Valid;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.entity.Account;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.repository.AccountRepository;
import miu.edu.northeastenbank.camsys.camsysspringbootapi.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/camsys/api/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody @Valid Account account) {
        return new ResponseEntity<>(accountService.createAccount(account), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccounts() {
        return new ResponseEntity<>(accountService.getAllAccount(), HttpStatus.OK);
    }

    @GetMapping("/deposit/list")
    public ResponseEntity<List<Account>> getAllDepositsByBalanceDesc() {
        return new ResponseEntity<>(accountService.getAllDepositAccountByBalanceDesc(), HttpStatus.OK);
    }

    @GetMapping("/prime/list")
    public ResponseEntity<List<Account>> getAllPrimeAccounts() {
        return new ResponseEntity<>(accountService.getAllPrimeAccounts(), HttpStatus.OK);
    }
}
