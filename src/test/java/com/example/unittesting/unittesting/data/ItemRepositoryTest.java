package com.example.unittesting.unittesting.data;

import com.example.unittesting.unittesting.model.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ItemRepositoryTest {
    @Autowired
    ItemRepository itemRepository;
    @Test
    public void testFindAll() {
        List<Item> items = itemRepository.findAll();
        assertEquals(3, items.size());
    }
}
