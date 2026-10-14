import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("assign "+(a=b));
        System.out.println("assign "+(a+=b));
        System.out.println("assign "+(a-=b));
        System.out.println("assign "+(a*=b));
        System.out.println("assign "+(a/=b));
        System.out.println("assign "+(a%=b));
        System.out.println("assign "+(a>>=b));
        System.out.println("assign "+(a<<=b));
        System.out.println("assign "+(a&=b));

    }
}
