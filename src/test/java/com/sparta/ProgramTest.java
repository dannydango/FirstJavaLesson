package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ProgramTest {

    @Test
    @DisplayName("Given a time of 21, Greeting returns Good Evening")
    public void given21_Greeting_ReturnsGoodEvening() {
        int time = 21;
        String expectedGreeting = "Good Evening!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Testing the boundaries")
    public void testBoundary() {
        int time = 12;
        String expectedOutput = "Good Afternoon!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expectedOutput, result);

    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 11})
    @DisplayName("Given a time between 5 and 11, greeting returns good morning")
    public void GivenTimeBetween5And12_Greeting_ReturnsGoodMorning(int time) {
        String expected = "Good Morning!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 16, 17})
    @DisplayName("Given a time between 12 and 17, greeting returns good afternoon")
    public void GivenTimeBetween13And18_Greeting_ReturnsGoodAfternoon(int time) {
        String expected = "Good Afternoon!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 24, 4})
    @DisplayName("Given a time between 5 and 12, greeting returns good evening")
    public void GivenTimeBetween18And04_Greeting_ReturnsGoodEvening(int time) {
        String expected = "Good Evening!";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 28, 102})
    @DisplayName("Given a time outside of the 24 hour clock returns invalid entry")
    public void GivenTimeOutside24_Greeting_ReturnsInvalidEntry(int time) {
        String expected = "This is an invalid entry please choose a number between 1 and 24";
        String result = Program.greeting(time);
        Assertions.assertEquals(expected, result);
    }
}
