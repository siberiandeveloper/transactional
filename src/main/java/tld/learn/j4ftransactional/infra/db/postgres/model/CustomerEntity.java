package tld.learn.j4ftransactional.infra.db.postgres.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private UUID uuid;

    private String firstName;

    private String middleName;

    private String lastName;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private WalletEntity wallet;

    private String phone;

    @JoinColumn(name = "customer_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderEntity> orders;

    private Instant createdAt;

}

