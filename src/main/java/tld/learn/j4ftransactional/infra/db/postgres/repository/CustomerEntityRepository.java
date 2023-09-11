package tld.learn.j4ftransactional.infra.db.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.learn.j4ftransactional.domain.repository.CustomerRepository;
import tld.learn.j4ftransactional.infra.db.postgres.model.CustomerEntity;

public interface CustomerEntityRepository extends CustomerRepository, JpaRepository<CustomerEntity, Long> {
}

