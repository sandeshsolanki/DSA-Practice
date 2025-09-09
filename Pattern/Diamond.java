package Pattern;

public class Diamond {
    public static void diamond(int n) {
        //for loop for line
        for (int line = 1; line <= n; line++) {
            // for loop for space
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");
            }
            // for loop for star
            for (int star = 1; star <= (2 *line - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int line = n; line >= 1; line--) {
            // for loop for space
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");
            }
            // for loop for star
            for (int star = 1; star <= (2 *line - 1); star++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        diamond(5);
    }
}
