package arrays;

public class SubArrays {
    public static void printSubArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            //int start = i;

            for (int j=0; j<arr.length; j++){
              //  int end =j;

                for (int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        printSubArray(arr);

    }
}
