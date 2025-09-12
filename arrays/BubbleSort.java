package arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {223,45,675,1,2,3,87,9,45,23,57,87,0};
        bubbleSort(arr);
        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}
