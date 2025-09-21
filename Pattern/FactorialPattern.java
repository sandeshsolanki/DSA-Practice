package Pattern;

public class FactorialPattern {

    public static int fact(int n){
        int fact =1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 4;
        int num = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(fact(num) + " ");
                num++;
            }
            System.out.println();
        }
    }
}
