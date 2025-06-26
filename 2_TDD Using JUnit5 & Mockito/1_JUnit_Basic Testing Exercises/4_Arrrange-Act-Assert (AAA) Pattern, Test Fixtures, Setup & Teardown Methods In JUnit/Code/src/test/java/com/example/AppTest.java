package com.example;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    private App app;

    @Before
    public void setUp() {
        System.out.println("Start Testing...");
        app = new App(); // Arrange
    }

    @After
    public void tearDown() {
        System.out.println("End Testing...");
        app = null;
    }

    @Test
    public void testIsEqual() {
        System.out.println("Running tests...");
        // Arrange
        int a = 4;
        int b = 4;
        // Act
        boolean actual = app.isequal(a, b);
        boolean expected = app.isequal(4,4);
        if (actual == expected) {
            System.out.println("testIsEqual passed successfully");
        }
        // Assert
        assertTrue(actual);
    }

    @Test
    public void testIsGreater() {
        System.out.println("Running tests...");
        // Arrange
        int a = 3;
        int b = 1;
        // Act
        boolean expected = app.isgreater(3,1);
        boolean actual = app.isgreater(a, b);
        if (actual == expected) {
            System.out.println("testIsGreater passed successfully");
        }
        // Assert
        assertTrue(actual);
    }

    @Test
    public void testIsLesser() {
        System.out.println("Running tests...");
        // Arrange
        int a = 2;
        int b = 5;
        // Act
        boolean expected = app.islesser(2,5);
        boolean actual = app.islesser(a, b);
        if (actual == expected) {
            System.out.println("testIsLesser passed successfully");
        }
        // Assert
        assertTrue(actual);
    }
}
