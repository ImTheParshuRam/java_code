import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a % b == 0) {
            System.out.println("Greatest common divisor is : " + b);
        } else if (b % a == 0) {
            System.out.println("Greatest common divisor is : " + a);
        } else {
            int gcd = 1;
            if (a > b) {
                for (int i = 1; i < a; i++) {
                    if (a % i == 0 && b % i == 0) {
                        gcd = gcd * i;
                    } else {
                        continue;
                    }
                }
                System.out.println("Greatest common divisor is : " + gcd);
            } else {
                for (int i = 1; i < b; i++) {
                    if (a % i == 0 && b % i == 0) {
                        gcd = gcd * i;
                    } else {
                        continue;
                    }
                }
                System.out.println("Greatest common divisor is : " + gcd);
            }

        }

        sc.close();

    }
}