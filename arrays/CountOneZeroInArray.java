package arrays;

public class CountOneZeroInArray {
    public static void count(int[] arr) {
        int zero = 0;
        int one = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one++;
            }
            if (arr[i] == 0) {
                zero++;
            }
        }
        System.out.println("the number of ones is : " + one);
        System.out.println("the number of zeros is : " + zero);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0};
        count(arr);
    }
}
