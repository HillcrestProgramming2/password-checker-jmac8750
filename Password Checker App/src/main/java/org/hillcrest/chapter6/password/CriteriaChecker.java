package org.hillcrest.chapter6.password;

/**
 * Utility class that evaluates the password strength criteria, this checks how strong the password is actually.
 */
public class CriteriaChecker {

    /**
     * Evaluates how many strength criteria the password meets.
     * @param password- the password that the user gives to evaluate
     * @return- number of criteria met and how good the password is
     */
    public static int evaluateCriteria(String password) {
        if (password == null) {
            return 0;
        }
        int score = 0;
        boolean hasAnUpper = false;
        boolean hasALower = false;
        boolean hasADigit = false;
        boolean hasASpecial = false;
        final String specialCharacters = "!@#$%^&*()-+=";

        // This checks the length
        if (password.length() >= 8) {
            score++;
        }

        // REQUIRED LOOP for character checks
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                hasAnUpper = true;
            }
            if (Character.isLowerCase(character)) {
                hasALower = true;
            }
            if (Character.isDigit(character)) {
                hasADigit = true;
            }
            if (specialCharacters.indexOf(character) != -1) {
                hasASpecial = true;
            }
        }

        if (hasAnUpper) score++;
        if (hasALower) score++;
        if (hasADigit) score++;
        if (hasASpecial) score++;

        return score;
    }

    /**
     * returns the actual written thing of what the statement should say
     * This determines the password strength
     * @param score- criteria score, how good the password that was made up is
     * @return-the word of how good and strong the passward is, strength label
     */
    public static String determineStrength(int score) {
        if (score <= 2) {
            return "Weak";
        } else if (score == 3) {
            return "Moderate";
        } else {
            return "Strong";
        }
    }
}