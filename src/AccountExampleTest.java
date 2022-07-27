public class AccountExampleTest {
    private static RegexAccountExample accountExample;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456", "akdffgdf"};
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234", "abcde"};

    public static void main(String[] args) {
        accountExample = new RegexAccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is valid: " + isvalid);
        }

        for (String account : invalidAccount) {
            boolean isinvalid = accountExample.validate(account);
            System.out.println("Account is " + account + " is invalid: " + isinvalid);
        }
    }

}
