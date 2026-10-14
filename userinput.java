import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the Roll_num");
        String Roll_num = sc.nextLine();
        System.out.println("Enter thr branch");
        String branch = sc.nextLine();
        System.out.println("Enter the College_name");
        String College_name = sc.nextLine();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the phone_num");
        Long phone_num = sc.nextLong();
        System.out.println("Enter the cgpa");
        float cgpa = sc.nextFloat();
        System.out.println("person details" +name+ " " +Roll_num+ " " +branch+ " " +College_name+ " " +age+ " " +phone_num+ " " +cgpa);

    }
}
