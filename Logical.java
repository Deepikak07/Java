import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a and b value");
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println (!(a&&b));

    }
}
