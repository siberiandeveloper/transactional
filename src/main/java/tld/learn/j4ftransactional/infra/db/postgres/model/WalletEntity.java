package tld.learn.j4ftransactional.infra.db.postgres.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
public class WalletEntity {

    @Id
    private Long id;

    private UUID uuid;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    private CustomerEntity customer;

    private Long balanceInKops;

}

