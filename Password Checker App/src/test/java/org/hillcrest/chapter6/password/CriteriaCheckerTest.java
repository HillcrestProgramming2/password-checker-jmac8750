package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CriteriaCheckerTest {
    /**
     * Unit tests for CriteriaChecker
     * Tests the weak passcode
     */

    @Test
    public void testWeakPasscode() {
        int score = CriteriaChecker.evaluateCriteria("12345");
        assertEquals(1, score);
        assertEquals("Weak", CriteriaChecker.determineStrength(score));
    }

    /**
     * Tests the moderate or the medium level password
     */
    @Test
    public void testModeratePasscode() {
        int score = CriteriaChecker.evaluateCriteria("password123");
        assertEquals(3, score);
        assertEquals("Moderate", CriteriaChecker.determineStrength(score));
    }

    /**
     * Tests a passcode that is very good
     */
    @Test
    public void testStrongPasscode() {
        int score = CriteriaChecker.evaluateCriteria("Secure@2024");
        assertEquals(5, score);
        assertEquals("Strong", CriteriaChecker.determineStrength(score));
    }
}