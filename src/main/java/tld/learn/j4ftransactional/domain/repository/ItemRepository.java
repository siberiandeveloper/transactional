package tld.learn.j4ftransactional.domain.repository;

import tld.learn.j4ftransactional.domain.model.Item;

import java.util.List;

public interface ItemRepository {

    void saveItem(Item item);

    List<Item> findItemsByName(String name);

}

