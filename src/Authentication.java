import java.util.Scanner;

public class Authentication {
    private static final String LOGIN = "admin";
    private static final String PASSWORD = "123";
    public static int authenticate(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your login:");
        var login= s.nextLine();
        System.out.println("Enter your password:");
        var password = s.nextLine();
        if (login.equals(LOGIN) && password.equals(PASSWORD)) {
            return 1;
        } else {
            return 0;
        }
    }
}
