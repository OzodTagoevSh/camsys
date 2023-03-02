package miu.edu.northeastenbank.camsys.camsysspringbootapi.repository;

import miu.edu.northeastenbank.camsys.camsysspringbootapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
