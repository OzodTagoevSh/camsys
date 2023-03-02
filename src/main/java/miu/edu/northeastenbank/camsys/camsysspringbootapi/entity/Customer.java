package miu.edu.northeastenbank.camsys.camsysspringbootapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @NotNull(message = "First Name can't be null")
    @NotEmpty(message = "First Name can't be empty")
    private String firstName;

    @NotNull(message = "Last Name can't be null")
    @NotEmpty(message = "Last Name can't be empty")
    private String lastName;

    @ManyToMany(mappedBy = "customers")
    private List<Account> accounts;
}
