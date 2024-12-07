package com.example.gt_beta;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testWelcomeMessage() {
        App app = new App();
        assertEquals("Welcome to GT Beta Application!", app.welcomeMessage());
    }

    @Test
    public void testStringContainsBeta() {
        App app = new App();
        assertTrue(app.welcomeMessage().contains("Beta"));
    }

    @Test
    public void testStringNotEmpty() {
        App app = new App();
        assertFalse(app.welcomeMessage().isEmpty());
    }

    @Test
    public void testLengthGreaterThan10() {
        App app = new App();
        assertTrue(app.welcomeMessage().length() > 10);
    }

    @Test
    public void testStartsWithWelcome() {
        App app = new App();
        assertTrue(app.welcomeMessage().startsWith("Welcome"));
    }
}

