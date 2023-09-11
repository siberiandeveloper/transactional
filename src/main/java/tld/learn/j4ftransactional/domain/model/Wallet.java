package tld.learn.j4ftransactional.domain.model;

import lombok.*;
import tld.learn.j4ftransactional.domain.exception.WalletBalanceException;

import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Wallet {

    private static final Long SUM_MIN_LIMIT = 0L;

    private final UUID uuid;

    private final Customer customer;

    private Long balanceInKops;

    public static Wallet create(Customer customer) {
        return new Wallet(UUID.randomUUID(), customer);
    }

    public long refill(Long sumInKops) {
        if (sumInKops <= SUM_MIN_LIMIT) {
            throw new IllegalArgumentException(String.format("Sum %s has to be positive", sumInKops));
        }

        balanceInKops += sumInKops;

        return balanceInKops;
    }

    public long subtract(Long costInKops) {
        if (costInKops <= SUM_MIN_LIMIT) {
            throw new IllegalArgumentException(String.format("Cost %s has to be positive", costInKops));
        } else if (costInKops > balanceInKops) {
            throw new WalletBalanceException(balanceInKops, costInKops);
        }

        balanceInKops -= costInKops;

        return balanceInKops;
    }

}

