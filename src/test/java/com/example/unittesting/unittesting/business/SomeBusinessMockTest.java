package com.example.unittesting.unittesting.business;

import com.example.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {
    @InjectMocks
    SomeBusinessImpl business;

    @Mock
    SomeDataService someDataServiceMock;

    @Test
    void calculateSumUsingDataService_basic() {

        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3});
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void calculateSumUsingDataService_empty () {
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void calculateSumUsingDataService_oneValue () {
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);

    }

}
