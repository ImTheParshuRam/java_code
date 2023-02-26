import java.util.*;

public class driven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            int b = sc.nextInt();
            if (b >= 0 && b <= 100) {
                if (b >= 90) {
                    System.out.println("This is Good");
                } else if (b >= 60) {
                    System.out.println("This is also Good");
                } else {
                    System.out.println("This is Good as well");
                }
            } else {
                System.out.println("Please enter valid marks!");
            }
            System.out.println("If u want to continue press 1 otherwise 0");
            a = sc.nextInt();
        } while (a == 1);
        sc.close();

    }

}
