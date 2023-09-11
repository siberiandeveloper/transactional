package tld.learn.j4ftransactional.infra.db.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.learn.j4ftransactional.domain.repository.OrderRepository;
import tld.learn.j4ftransactional.infra.db.postgres.model.OrderEntity;

public interface OrderEntityRepository extends OrderRepository, JpaRepository<OrderEntity, Long> {
}

