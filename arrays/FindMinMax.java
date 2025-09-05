package arrays;

public class FindMinMax {
    public static void findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        for (int i=0; i< arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("the min number is : " + min);
        System.out.println("the max number is : " + max);
    }

    public static void main(String[] args) {
        int[] arr = {54,34,6,89,2,90,43};
        findMinMax(arr);
    }
}
