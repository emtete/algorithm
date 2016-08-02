import java.util.Arrays;

/**
 * Created by victor on 2016. 7. 8..
 */
public class MergeSort {
    public int[] mergeSort(int[] arr){
        if( arr.length < 2) return arr;

        int size = arr.length;
        int[] arr1 =  Arrays.copyOf(arr, size/2);
        int[] arr2 = Arrays.copyOfRange(arr, size/2, size);

        arr1 = mergeSort(arr1);
        arr2 = mergeSort(arr2);

        return merge(arr1, arr2);
    }



    public int[] merge(int[] arr1, int[] arr2){
        int arr1L = arr1.length;
        int arr2L = arr2.length;
        int[] arr3 = new int[ arr1L + arr2L ];
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        while( i1 < arr1L ){
            if( i2 < arr2L )
                arr3[i3++] = ( arr1[i1] < arr2[i2] ) ? arr1[i1++] : arr2[i2++];
            else
                arr3[i3++] = arr1[i1++];

        }
        while( i2 < arr2L){
            arr3[i3++] = arr2[i2++];
        }
        return arr3;
    }
}
