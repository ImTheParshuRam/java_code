import java.util.*;

public class pattern {
    public static void solidrect(int row, int col) {
        System.out.println("sold rectangle");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void hollow(int row, int col) {
        System.out.println("Hollow rectangle");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == 1 || j == 1 || i == row || j == col) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void half_pyramid(int row) {
        System.out.println("Half pyramid");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void Inverted_pyramid(int row) {
        System.out.println("Half pyramid");
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void rotate_pyramid(int row) {
        System.out.println("rotated pyramid");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= (row - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void flyod(int row) {
        System.out.println("flyod's triangle");
        int number = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void binary(int row) {
        System.out.println("binary triangle");
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give some value of row and column");
        int row = sc.nextInt();
        int col = sc.nextInt();
        solidrect(row, col);
        hollow(row, col);
        half_pyramid(row);
        Inverted_pyramid(row);
        rotate_pyramid(row);
        flyod(row);
        binary(row);
        sc.close();

    }

}
