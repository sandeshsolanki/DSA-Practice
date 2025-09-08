package recursion;

public class FibonacciSeries {
    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int I = 10;
        for (int i=0; i<=I; i++){
            System.out.print(fib(i) + " ");
        }
    }
}
