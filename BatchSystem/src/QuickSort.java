/**
 * Created by victor on 2016. 7. 8..
 */
public class QuickSort {
    public void quickSort(int[] arr){
        search(arr, 0, arr.length-1);
    }

    public void search(int[] arr, int low, int high){
        if( high <= low ) return;
        int pivot = low;
        int start = low;
        int end = high;

        while(high > low) {
            while (high >= low) {
                if (arr[high] < arr[pivot]) {
                    swap(arr, high, pivot);
                    pivot = high--;
                    break;
                }
                --high;
            }
            while (high >= low) {
                if (arr[low] > arr[pivot]) {
                    swap(arr, low, pivot);
                    pivot = low++;
                    break;
                }
                ++low;
            }
        }

        search(arr, start, pivot-1 );
        search(arr, pivot+1, end );
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
