package org.hillcrest.chapter6.password;

/**
 * Utility class that generates feedback for improving password, so it sees how good your password is and gives you feedback on it.
 */
public class FeedbackGenerator {
    public static String generateFeedback(String password) {
        String feedback = "";

        boolean hasAnUpper = false;
        boolean hasALower = false;
        boolean hasADigit = false;
        boolean hasASpecial = false;
        String specialCharacters = "!@#$%^&*()-+=";

        if (password.length() < 8) {
            feedback += "- Increase the length to at least 8 characters.\n";
        }

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

            /**
             * Generates feedback suggestions for unmet criteria.
             * @param password the password to analyze
             * @return feedback string (empty if no improvements needed)
             */

            if (!hasAnUpper) {
                feedback += "- Add at least one uppercase letter.\n";
            }
            if (!hasALower) {
                feedback += "- Add at least one lowercase letter.\n";
            }
            if (!hasADigit) {
                feedback += "- Add at least one number.\n";
            }
            if (!hasASpecial) {
                feedback += "- Include at least one special character.\n";
            }
            return feedback;
        }


}

