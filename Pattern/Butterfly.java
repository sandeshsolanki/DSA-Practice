package Pattern;

public class Butterfly {
    public static void butterflyPatter(int n) {
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 *( n -line); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int line = n; line >= 1; line--) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (n - line); space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterflyPatter(5);
    }
}
