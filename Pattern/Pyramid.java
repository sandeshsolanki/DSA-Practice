package Pattern;

public class Pyramid {
    public static void pyramidPattern(int n){
        for (int line=1; line<=n; line++){
            for (int space=1; space<=n-line; space++){
                System.out.print(" ");
            }
            for (int star=1; star<= (2*line-1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        pyramidPattern(5);
    }
}
