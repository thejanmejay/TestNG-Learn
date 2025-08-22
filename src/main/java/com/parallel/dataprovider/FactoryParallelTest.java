package com.parallel.dataprovider;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryParallelTest {

    private int id;

    // Constructor takes parameter
    public FactoryParallelTest(int id) {
        this.id = id;
    }

    @Test
    public void testMethod() {
        System.out.println("Running instance " + id + 
                           " on Thread: " + Thread.currentThread().getId());
    }

    // Factory to create multiple test instances
    @Factory
    public static Object[] createInstances() {
        return new Object[] {
            new FactoryParallelTest(1),
            new FactoryParallelTest(2),
            new FactoryParallelTest(3),
            new FactoryParallelTest(4)
        };
    }
}
