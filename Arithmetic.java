import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition is: "+(a + b));
        System.out.println("Subtraction: "+(a - b));
        System.out.println("Multiplication: "+(a * b));
        System.out.println("Division: "+(a / b));
        System.out.println("Modulus: "+(a % b));
        System.out.println("Increment: "+(++a ));
        System.out.println("Decrement: "+(--a));

    }
}
