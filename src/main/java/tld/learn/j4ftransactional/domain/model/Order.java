package tld.learn.j4ftransactional.domain.model;

import lombok.*;
import tld.learn.j4ftransactional.domain.exception.OrderModificationException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public final class Order {

    private static final String NUMBER_PREFIX = "ORDER ";

    private final UUID uuid;

    private final String number;

    private final Customer customer;

    private final List<Item> items;

    private BigDecimal totalCost;

    public static Order createCustomerOrder(Customer customer) {
        final UUID uuid = UUID.randomUUID();
        final String number = Optional.of(uuid)
                .map(uuid4 -> NUMBER_PREFIX + uuid4)
                .map(String::toUpperCase)
                .map(num -> num.substring(0, NUMBER_PREFIX.length()))
                .orElse(uuid.toString());

        return new Order(uuid, number, customer, new ArrayList<>());
    }

    public void addItem(Item item) {
        if (item == null) {
            throw new OrderModificationException("An attempt to add null item to the order.");
        }

        items.add(item);
        totalCost = totalCost.add(BigDecimal.valueOf(item.getCostInKops()));
    }

}

