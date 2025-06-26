package com.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    App app = new App();

    @Test
    public void testAdd() {
        System.out.println("Running tests...");
        // Assert equals
        int expected = 5;
        int actual = app.add(2, 3);
        if (expected == actual) {
            System.out.println("AssertEquals passed successfully");
        }
        assertEquals(expected, actual);
    }

    @Test
    public void testIsGreater() {
        System.out.println("Running tests...");
        // Assert true
        boolean expected = true;
        boolean actual = app.isgreater(5, 3);
        if (actual == expected) {
            System.out.println("AssertTrue passed successfully");
        }
        assertTrue(actual);
    }

    @Test
    public void testIsNotLess() {
        System.out.println("Running tests...");
        // Assert false
        boolean expected = false;
        boolean actual = app.isnotless(5, 3);
        if (actual == expected) {
            System.out.println("AssertFalse passed successfully");
        }
        assertFalse(actual);
    }

    @Test
    public void testIsNull() {
        System.out.println("Running tests...");
        // Assert null
        Object expected = null;
        boolean actual = app.checkobject(expected);
        if (!actual) {
            System.out.println("AssertNull passed successfully");
        }
        assertNull(expected);
    }

    @Test
    public void testIsNotNull(){
        System.out.println("Running tests...");
        // Assert not null
        Object expected = new Object();
        boolean actual = app.checkobject(expected);
        if (actual) {
            System.out.println("AssertNotNull passed successfully");
        }
        assertNotNull(expected);
    }
}
