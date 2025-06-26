package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App app = new App();

    @Test
    public void testAdd() {
        System.out.println("Running testAdd...");
        int expected = 10;
        int actual = app.add(4, 6);
        if (expected == actual) {
            System.out.println("testAdd passed successfully");
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        System.out.println("Running testSubtract...");
        int expected = 1;
        int actual = app.subtract(10, 9);
        if (expected == actual) {
            System.out.println("testSubtract passed successfully");
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        System.out.println("Running testMultiply...");
        int expected = 15;
        int actual = app.multiply(5, 3);
        if (expected == actual) {
            System.out.println("testMultiply passed successfully");
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        System.out.println("Running testDivide...");
        int expected = 3;
        int actual = app.divide(9, 3);
        if (expected == actual) {
            System.out.println("testDivide passed successfully");
        }
        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        System.out.println("Running testDivideByZero...");
        try {
            app.divide(50, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("testDivideByZero passed successfully (exception correctly thrown)");
            throw e;
        }
    }
}
