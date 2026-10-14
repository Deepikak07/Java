class person
{
    String name = "Deepu";
    int age = 18;
}
class dog
{
    String name = "Golden retriver";
    String colour = "Blue";
}
public class Class {
    public static void main(String[] args) {
        person p1 = new person();
        person p2 = new person();
        System.out.println(p1.name);
        System.out.println(p2.age);
        dog d = new dog();
        System.out.println(d.name);
        System.out.println(d.colour);

    }

}
