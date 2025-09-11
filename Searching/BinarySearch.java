package Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key){

                int left = 0;
                int right = arr.length - 1;

                while (left <= right) {
                    int mid = left + (right - left) / 2; // avoid overflow

                    if (arr[mid] == key) {
                        return mid; // key found
                    } else if (arr[mid] < key) {
                        left = mid + 1; // search right half
                    } else {
                        right = mid - 1; // search left half
                    }
                }
                return -1; // not found
            }

            public static void main(String[] args) {
                int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 50};
                int key = 23;

                int result = binarySearch(arr, key);

                if (result == -1) {
                    System.out.println("Element not found!");
                } else {
                    System.out.println("Element found at index: " + result);
                }
            }
        }



