import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the role");
        String role = sc.nextLine();
        System.out.println("Enter the username");
        String username = sc.nextLine();
        System.out.println("Enter the password");
        String password = sc.nextLine();
        if(role.equals("admin")) {
            if (username.equals("ajay")) {
                if (password.equals("ngk")) {
                    System.out.println("your eligible to access the entire office");

                } else {
                    System.out.println("your restricted to enter");
                }
            }
        }
        else if(role.equals("developer"))
        {
            System.out.println("Your work is developer");

        }

    }
}
