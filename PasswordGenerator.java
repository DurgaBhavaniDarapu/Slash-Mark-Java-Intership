import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public static String generatePassword(int length, boolean useLowercase, boolean useUppercase, boolean useNumbers, boolean useSpecialChars) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();
        String chars = "";

        if (useLowercase) chars += LOWERCASE_CHARS;
        if (useUppercase) chars += UPPERCASE_CHARS;
        if (useNumbers) chars += NUMBERS;
        if (useSpecialChars) chars += SPECIAL_CHARS;

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(chars.length());
            password.append(chars.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int length = 12; // Change this to set the desired length of the password
        boolean useLowercase = true;
        boolean useUppercase = true;
        boolean useNumbers = true;
        boolean useSpecialChars = true;

        String password = generatePassword(length, useLowercase, useUppercase, useNumbers, useSpecialChars);
        System.out.println("Generated Password: " + password);
    }
}