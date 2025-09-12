package arrays;

import java.util.Arrays;

public class RotateArray {


        // Rotate array to the left by d positions
        public static void leftRotate(int[] arr, int d) {
            int n = arr.length;
            d = d % n; // in case d > n
            reverse(arr, 0, d - 1);
            reverse(arr, d, n - 1);
            reverse(arr, 0, n - 1);
        }

        // Rotate array to the right by d positions
        public static void rightRotate(int[] arr, int d) {
            int n = arr.length;
            d = d % n; // in case d > n
            reverse(arr, n - d, n - 1);
            reverse(arr, 0, n - d - 1);
            reverse(arr, 0, n - 1);
        }

        // Utility function to reverse part of an array
        private static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int d = 2;

            System.out.println("Original Array: " + Arrays.toString(arr));

            // Left Rotation
            leftRotate(arr, d);
            System.out.println("Left Rotated by " + d + ": " + Arrays.toString(arr));

            // Right Rotation
            rightRotate(arr, d);
            System.out.println("Right Rotated by " + d + ": " + Arrays.toString(arr));
        }
    }

