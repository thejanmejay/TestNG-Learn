package com.parallel.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParallelTest {

    @DataProvider(name = "numbers", parallel = true)
    public Object[][] getData() {
        return new Object[][] {
            {1}, {2}, {3}, {4}, {5}
        };
    }

    @Test(dataProvider = "numbers")
    public void testNumbers(int num) {
        System.out.println("Running test with number: " + num + 
                           " on Thread: " + Thread.currentThread().getId());
    }
}
