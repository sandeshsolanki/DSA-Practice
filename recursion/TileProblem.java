package recursion;

public class TileProblem {
    public static int tileProblem(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        return tileProblem(n-1) + tileProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tileProblem(4));
    }
}
