package com.example.unittesting.unittesting.business;

import com.example.unittesting.unittesting.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemBusinessService {

    public Item retrieveHardcodedItem () {
        return new Item(1, "Ball", 10, 100);
    }
}
