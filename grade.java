import java.util.Scanner;

public class grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10:
                System.out.println("Outstanding grade");
                break;

            case 9:
                System.out.println("Excellent grade");
                break;

            case 8:
                System.out.println("Very good grade");
                break;

            case 7:
                System.out.println("Good grade");
                break;

            case 6:
                System.out.println("Average grade");
                break;

            case 5:
            case 4:
                System.out.println("Pass grade");
                break;

            default:
                System.out.println("Fail");
        }
    }
}