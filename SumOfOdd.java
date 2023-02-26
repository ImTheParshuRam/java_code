import java.util.*;

public class SumOfOdd {
    public static void Sum(int a) {
        if (a > 0) {
            int odd = 0;
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0) {
                    continue;
                } else {
                    odd = odd + i;
                }
            }
            System.out.println("sum of odd numbers are :" + odd);
        } else {
            System.out.println("Please enter positive numbers");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Sum(a);
        sc.close();
    }

}
