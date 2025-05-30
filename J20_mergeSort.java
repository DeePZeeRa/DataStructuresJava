import java.util.Arrays;

public class J20_mergeSort {
    public static void main(String[] args) {
        int [] arr = {4,23,4,1,5,7,9};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

 

    static void mergeSort(int [] arr, int low, int high){
        // check if the splited array has 1 element, return
        if(low>=high){
            return;
        }
        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);// left array
        mergeSort(arr, mid+1, high); // right array
        merge(arr,low,mid,high);
    }

    static void merge(int [] arr,int low,int mid,int high){
        int [] temp = new int[arr.length];

        int left = low; // left array starting point
        int right = mid+1; // right array starting point
        int index = 0;


        
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[index] = arr[left];
                index++;
                left++;
            }else{
                temp[index] = arr[right];
                index++;
                right++;
            }
        }
        // check if left array still contain elements, then put them to the temp
        while(left<=mid){
            temp[index] = arr[left];
            index++;
            left++;
        }
        // check if right array still contain elements, then put them to the temp
        while (right <= high) {
            temp[index] = arr[right];
            index++;
            right++;
        }

        for (int i = 0; i < index; i++) {
            arr[low + i] = temp[i];
        }
        
        // We use low + i to ensure that the elements in the correct subarray range of arr get updated. Without low, we'd overwrite elements in the wrong place (like the start of the array), corrupting the sort.
    }
}
