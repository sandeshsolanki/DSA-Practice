package arrays;

public class MoveZero {
    public static void moveZeroToEnd(int[] arr){
        int index = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] != 0){
                arr[index] = arr[i];
                index ++;
            }
        }

        while(index < arr.length){
            arr[index] = 0;
            index ++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,0,43,0,1,8,7,0};

        moveZeroToEnd(arr);
        System.out.println("Array after moving the zeros : " );

        for (int i:arr){
            System.out.print(i + " ");
        }
    }
}
