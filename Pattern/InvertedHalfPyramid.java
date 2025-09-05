package Pattern;

public class InvertedHalfPyramid {
    public static void inverted_rotated_half_pyramid(int n){
        // for loop for line
         for(int i=1; i<=n; i++){
             // for loop for space
             for (int j=1; j<=n-i; j++){
                 System.out.print(" ");
             }
             // for loop for print star
             for (int j=1; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }


    public static void main(String[] args) {

        inverted_rotated_half_pyramid(4);
    }
}
