package Programs;

import java.util.Arrays;

public class Main {
    public static int[] divide(int[] arr) {

    if(arr.length == 1) {
        return arr;
    }

 

    int middleIndexValue = arr.length / 2;

    int[] leftArr = divide(Arrays.copyOfRange(arr, 0, middleIndexValue));

    int[] rightArr = divide(Arrays.copyOfRange(arr, middleIndexValue, arr.length));

    return mergeSort(leftArr, rightArr);
    }
 

    public static int[] mergeSort(int[] leftArr, int[] rightArr) {

        int[] joinedArr = new int[leftArr.length + rightArr.length];

        int i = 0, j = 0, k = 0;

        while(i < leftArr.length && j < rightArr.length) {
            if(leftArr[i] < rightArr[j]) {
                joinedArr[k++] = leftArr[i++];
            } else {
                joinedArr[k++] = rightArr[j++];
            }
        }
        
        while(i < leftArr.length) {
            joinedArr[k++] = leftArr[i++];
        }
        
        while(j < rightArr.length) {
            joinedArr[k++] = rightArr[j++];
        }
        
        return joinedArr;
    }

    public static void main(String[] args) {

        int[] arr = {5, 9, 6, 4, 1, 3, 8};

        arr = divide(arr);

        System.out.println(Arrays.toString(arr));
    }
}