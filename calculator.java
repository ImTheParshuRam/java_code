import java.util.*;

class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give 2 numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("select operation");
        System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Divison \n5. Modulo or Remainder");
        int key = sc.nextInt();
        switch (key) {
            case 1:
                int sum = a + b;
                System.out.print("Addition of a and b is : ");
                System.out.println(sum);
                break;
            case 2:
                int diff = a - b;
                System.out.print("Substraction of a and b is : ");
                System.out.println(diff);
                break;
            case 3:
                int mult = a * b;
                System.out.print("Multiplication of a and b is : ");
                System.out.println(mult);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid value of b");
                } else {
                    int div = a / b;
                    System.out.print("Division of a and b is : ");
                    System.out.println(div);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid value of b");
                } else {
                    int rem = a % b;
                    System.out.print("Modulo or remainder of a and b is : ");
                    System.out.println(rem);
                }
                break;

            default:
                System.out.println("Please select correct operation!");
                break;
        }

    }
}
