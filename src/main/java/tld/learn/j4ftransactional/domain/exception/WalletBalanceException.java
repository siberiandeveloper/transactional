package tld.learn.j4ftransactional.domain.exception;

import lombok.Getter;

@Getter
public class WalletBalanceException extends RuntimeException {

    public static final String COST_EXCEEDS_BALANCE =
            "Current balance limit exceeded [cost %s exceeds balance %s]";

    private final long actualBalance;
    private final long operationCost;

    public WalletBalanceException(long actualBalance, long operationCost) {
        super(String.format(COST_EXCEEDS_BALANCE, operationCost, actualBalance));
        this.actualBalance = actualBalance;
        this.operationCost = operationCost;
    }

}

