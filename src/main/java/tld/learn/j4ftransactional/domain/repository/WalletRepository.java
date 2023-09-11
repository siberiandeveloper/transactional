package tld.learn.j4ftransactional.domain.repository;

import tld.learn.j4ftransactional.domain.model.Wallet;

import java.util.Optional;
import java.util.UUID;

public interface WalletRepository {

    void saveWallet(Wallet wallet);

    Optional<Wallet> findWalletByUuid(UUID uuid);

}

