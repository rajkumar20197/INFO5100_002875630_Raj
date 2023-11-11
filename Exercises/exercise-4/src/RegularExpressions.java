import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        // Subject strings for testing
        String positiveEmail = "thota.raj@northeastern.edu";
        String negativeEmail = "invalid.email@.com";

        String positivePhone = "123-456-7890";
        String negativePhone = "9440-910-929";

        String positiveDate = "2024-01-21";
        String negativeDate = "20/01/2024";

        String positiveUsername = "profile@001";
        String negativeUsername = "id$9980";

        String positivePassword = "Password";
        String negativePassword = "northeastern@7788";


        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";
        String phonePattern = "^\\d{3}-\\d{3}-\\d{4}$";
        String datePattern = "^\\d{4}-\\d{2}-\\d{2}$";
        String usernamePattern = "^[A-Za-z0-9_]{5,}$";
        String passwordPattern = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";

        testPattern(positiveEmail, emailPattern, "Email id");
        testPattern(positivePhone, phonePattern, "Phone no.");
        testPattern(positiveDate, datePattern, "Date of birth");
        testPattern(positiveUsername, usernamePattern, "Username");
        testPattern(positivePassword, passwordPattern, "Password");

        System.out.println("\n--------------------------------------\n");

        // Test negative cases
        testPattern(negativeEmail, emailPattern, "Email id");
        testPattern(negativePhone, phonePattern, "Phone no.");
        testPattern(negativeDate, datePattern, "Date of birth");
        testPattern(negativeUsername, usernamePattern, "Username");
        testPattern(negativePassword, passwordPattern, "Password");
    }

    private static void testPattern(String input, String pattern, String description) {
        Pattern regexPattern = Pattern.compile(pattern);
        Matcher matcher = regexPattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(description + " Test - Positive Case:");
            System.out.println("   Input: " + input);
            System.out.println("   Result: Match\n");
        } else {
            System.out.println(description + " Test - Negative Case:");
            System.out.println("   Input: " + input);
            System.out.println("   Result: No match\n");
        }
    }
}