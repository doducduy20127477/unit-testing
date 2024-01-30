package com.example.unittesting.unittesting.business;

import com.example.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {
    SomeBusinessImpl business = new SomeBusinessImpl();
    SomeDataService someDataServiceMock = mock(SomeDataService.class);

    @BeforeEach
    public void before() {
        business.setSomeDataService(someDataServiceMock);

    }
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
