package com.example.unittesting.unittesting.business;

import com.example.unittesting.unittesting.data.SomeDataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {
    @Test
    void calculateSumUsingDataService_basic() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        SomeDataService someDataServiceMock = mock(SomeDataService.class);
        when(someDataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3});
        business.setSomeDataService(someDataServiceMock);
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);

    }

//    @Test
//    void calculateSumUsingDataService_empty () {
//        SomeBusinessImpl business = new SomeBusinessImpl();
//        business.setSomeDataService(new SomeDataServiceEmptyStub());
//        int actualResult = business.calculateSumUsingDataService();
//        int expectedResult = 0;
//        assertEquals(expectedResult, actualResult);
//
//    }
//
//    @Test
//    void calculateSumUsingDataService_oneValue () {
//        SomeBusinessImpl business = new SomeBusinessImpl();
//        business.setSomeDataService(new SomeDataServiceOneElementStub());
//        int actualResult = business.calculateSumUsingDataService();
//        int expectedResult = 5;
//        assertEquals(expectedResult, actualResult);
//
//    }

}
