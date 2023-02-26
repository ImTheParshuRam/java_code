import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            if (n == 2) {
                System.out.println("Prime number");
            }
            if (n == 1) {
                System.out.println("CoPrime number");
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime number");
                    break;
                } else if (i == (n - 1)) {
                    System.out.println("Prime number");
                } else {
                    continue;

                }

            }

        } else {
            System.out.println("Negative number are not prime");
        }
        sc.close();
    }

}
