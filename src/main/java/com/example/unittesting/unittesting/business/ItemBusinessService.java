package com.example.unittesting.unittesting.business;

import com.example.unittesting.unittesting.data.ItemRepository;
import com.example.unittesting.unittesting.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ItemBusinessService {
    @Autowired
    ItemRepository itemRepository;

    public Item retrieveHardcodedItem () {
        return new Item(1, "Ball", 10, 100);
    }

    public List<Item> retrieveAllItems () {
        List<Item> items = itemRepository.findAll();
        for ( Item item : items ) {
            item.setValue(item.getPrice() * item.getQuantity());
        }
        return items;
    }
}
