package Pattern;

public class NumberPattern {
    public static void main(String[] args) {
        int s = 4;
        for (int i=1; i<=s; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
