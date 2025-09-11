package Searching;

public class LinearSearch {
    public static int linearSearching(int[] arr, int key){
        for (int i=0; i< arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,34,5,6,7,8,9};
        int key = 34;
        int result = linearSearching(arr,key);

        if (result == -1){
            System.out.println("Element not found!");
        }
        else {
            System.out.println("Element found at index : " + result);
        }
    }
}
