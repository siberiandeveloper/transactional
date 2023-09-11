package tld.learn.j4ftransactional.infra.db.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tld.learn.j4ftransactional.domain.repository.ItemRepository;
import tld.learn.j4ftransactional.infra.db.postgres.model.ItemEntity;

public interface ItemEntityRepository extends ItemRepository, JpaRepository<ItemEntity, Long> {
}

