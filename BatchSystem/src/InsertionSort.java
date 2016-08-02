/**
 * Created by victor on 2016. 7. 8..
 */
public class InsertionSort {
    public int[] insertionSort(int[] arr){
        int low = 0;
        int high = arr.length;
        for(int i=low; i < high; i++)
            for(int j=i; j > low && arr[j-1] > arr[j]; j--)
                swap(arr, j);

        return arr;
    }
    public void swap(int[] arr, int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
