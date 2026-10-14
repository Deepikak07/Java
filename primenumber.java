public class primenumber {
    public static void main(String[] args) {
        int n = 11;
        boolean num = true;
        for(int i = 2; i<n; i++)
        {
            if(n%i == 0) {
                num =false;
                break;
            }
        }
        if(num) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a Prime number");
        }
    }
}
