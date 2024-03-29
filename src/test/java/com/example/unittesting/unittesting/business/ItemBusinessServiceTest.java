package com.example.unittesting.unittesting.business;

import com.example.unittesting.unittesting.data.ItemRepository;
import com.example.unittesting.unittesting.model.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {
    @InjectMocks
    ItemBusinessService itemBusinessService;

    @Mock
    ItemRepository itemRepository;

    @Test
    void retrieveAllItems_basic() {

        when(itemRepository.findAll()).thenReturn(
                Arrays.asList(
                    new Item(2, "Item2", 10, 10),
                    new Item(3, "Item3", 20, 20)
                )
        );
        List<Item> items = itemBusinessService.retrieveAllItems();
        assertEquals(100, items.get(0).getValue());
        assertEquals(400, items.get(1).getValue());

    }


}
