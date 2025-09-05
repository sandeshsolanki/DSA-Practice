package Pattern;

public class invertedHalfPyramidNumber {
    public static void inverted_rotated_half_pyramid_number(int n){
        //for line
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid_number(6);
    }
}
