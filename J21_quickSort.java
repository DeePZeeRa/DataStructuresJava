import java.util.Arrays;

public class J21_quickSort {
    public static void main(String[] args) {
        int [] arr = {4,23,4,1,5,7,9};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
    static void QuickSort(int [] arr,int low ,int high){
        if(low<high){
            int pIndex = partition(arr, low, high);
            QuickSort(arr, low, pIndex - 1);
            QuickSort(arr, pIndex + 1, high);
        }
        
    }
    static int partition(int [] arr,int low , int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;

    }
}
