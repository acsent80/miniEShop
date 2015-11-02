package com.acsent.repository;

import com.acsent.model.Item;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Qualifier(value = "ItemRepository")
public interface ItemRepository extends CrudRepository<Item, UUID> {
    Item findByName(String name);
}