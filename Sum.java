import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int Sum = 0;
        while (n > 0) {
            int num = n%10;
            Sum = Sum + num;
            n = n/10;
        }
        System.out.println("Sum: " +Sum);

        }
        }
