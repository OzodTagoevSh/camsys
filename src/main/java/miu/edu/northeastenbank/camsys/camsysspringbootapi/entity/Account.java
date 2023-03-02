package miu.edu.northeastenbank.camsys.camsysspringbootapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "The account number can't set to be null")
    @NotEmpty(message = "The account number can't be empty")
    @Column(unique = true)
    private String accountNumber;

    @NotNull(message = "The account type can't be null")
    @NotNull(message = "The account type can't be empty")
    private String accountType;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOpened;

    @NotNull(message = "Balance can't be null")
    @NotEmpty(message = "You should enter the balance")
    private Double balance;

    @ManyToMany
    @JoinTable(
            name = "customer_account",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "customer_id")
    )
    private List<Customer> customers;
}
