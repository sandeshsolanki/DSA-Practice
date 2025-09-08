package recursion;

public class SumNumber {
    public static int sumOfFirstNaturalNumber(int n){
        if (n == 1){
            return 1;
        }

        return n + sumOfFirstNaturalNumber(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfFirstNaturalNumber(10));
    }
}
