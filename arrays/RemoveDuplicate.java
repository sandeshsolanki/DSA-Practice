package arrays;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] arr){
        if (arr.length == 0) return 0;

        int i = 0;
        for (int j=1; j< arr.length; j++){
            if (arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5,6,7,7,7};

        int k = removeDuplicate(arr);

        System.out.println("Number of unique element : " + k);
        System.out.println("array after removing duplicate : ");


        for (int i=0; i<k; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
