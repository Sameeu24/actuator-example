package com.actuators.item_service.controller;


import com.actuators.item_service.repository.ItemRepository;
import com.actuators.item_service.domain.Item;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private ItemRepository itemRepository;


    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }
}
