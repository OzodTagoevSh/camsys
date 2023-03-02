package miu.edu.northeastenbank.camsys.camsysspringbootapi.repository;

import miu.edu.northeastenbank.camsys.camsysspringbootapi.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    @Query("SELECT a FROM Account as a WHERE a.accountType NOT IN 'Loan' ORDER BY a.balance DESC ")
    List<Account> getAllDepositAccountsByBalanceSort();


    Double getLiquidityPosition();

    @Query("SELECT a FROM Account as a WHERE a.accountType NOT IN 'Loan' AND a.balance >= 100000 ")
    List<Account> getAllPrimeAccounts();
}

/*
@Query("SELECT COALESCE(SUM(a.balance), 0) FROM Account a WHERE a.type IN (:types)")
    BigDecimal sumBalanceByType(@Param("types") String... types);
 */
