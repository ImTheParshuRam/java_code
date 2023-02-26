import java.util.*;

public class even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Even numbers are :");
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
        sc.close();
    }

}
