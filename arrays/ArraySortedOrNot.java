package arrays;

public class ArraySortedOrNot {
    public static boolean sortedOrNot(int[] arr){
        for (int i=1; i< arr.length; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,4,1};
        System.out.println(sortedOrNot(arr));

        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println(sortedOrNot(arr2));
    }
}
