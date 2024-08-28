package com.actuators.item_service.repository;

import com.actuators.item_service.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository<Item,Long> {
}
