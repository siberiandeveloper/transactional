package tld.learn.j4ftransactional.domain.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
public final class Customer {

    private final UUID uuid;

    private final FullName name;

    private final Wallet wallet;

    private final String phone;

    private final List<Order> orders;

    public Customer(FullName name, String phone) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.wallet = Wallet.create(this);
        this.phone = phone;
        this.orders = new ArrayList<>();
    }

}

