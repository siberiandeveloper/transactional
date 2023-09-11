package tld.learn.j4ftransactional.infra.db.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.learn.j4ftransactional.domain.repository.WalletRepository;
import tld.learn.j4ftransactional.infra.db.postgres.model.WalletEntity;

public interface WalletEntityRepository extends WalletRepository, JpaRepository<WalletEntity, Long> {
}

