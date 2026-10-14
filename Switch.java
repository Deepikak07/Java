import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        switch(10)
        {
            case 1:
                System.out.println("5");
                break;
            case 2:
                System.out.println("10");
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
