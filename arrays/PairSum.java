package arrays;

public class PairSum {
    public static void findPairSum(int[] arr, int target){
        for (int i=0; i< arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,12,43,6,7,12,23};
        int target = 12;
        findPairSum(arr,target);
    }
}
